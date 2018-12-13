import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

import javax.xml.bind.DatatypeConverter;
import java.security.*;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * DSA算法特点
 * 1、DSA是以RSA为基础形成的
 * 2、java6提供了DSA的实现，但是java6只提供了SHA1withDSA的实现
 * 3、公钥与私钥匙成对出现，遵从的原则就是“私钥签名、公钥验证”。
 *
 * @Author: zhangb
 * @Date: 2018/11/11 22:59
 */
public class SignatureExample {
    private static String src = "hello";

    public static void main(String[] args) {
//        jdkDSA();
        jdkECDSA();
    }


    public static void jdkDSA() {
        // 1. 初始化 秘钥,生成DSA算法的公钥和私钥
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("DSA");
            generator.initialize(512);

            KeyPair keyPair = generator.generateKeyPair();
            DSAPublicKey dsaPublicKey = (DSAPublicKey) keyPair.getPublic();
            DSAPrivateKey dsaPrivateKey = (DSAPrivateKey) keyPair.getPrivate();

            // 2. 执行签名
            PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(dsaPrivateKey.getEncoded());
            KeyFactory factory = KeyFactory.getInstance("DSA");
            PrivateKey privateKey = factory.generatePrivate(pkcs8EncodedKeySpec);

            Signature signature = Signature.getInstance("SHA1withDSA");
            signature.initSign(privateKey);
            signature.update(src.getBytes());
            byte[] sign = signature.sign();
            System.out.println(DatatypeConverter.printHexBinary(sign));
            // 3. 验证签名，使用公钥验证私钥签名
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(dsaPublicKey.getEncoded());

            factory = KeyFactory.getInstance("DSA");
            PublicKey publicKey = factory.generatePublic(x509EncodedKeySpec);

            signature = Signature.getInstance("SHA1withDSA");
            signature.initVerify(publicKey);
            signature.update(src.getBytes());

            boolean verify = signature.verify(sign);

            System.out.println(verify);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 椭圆曲线数字签名算法
    public static void jdkECDSA() {
        // 1. 初始化 密钥
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            // 密钥长度:112～571,默认:256
            keyPairGenerator.initialize(256);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            ECPublicKey ecPublicKey = (ECPublicKey) keyPair.getPublic();
            ECPrivateKey ecPrivateKey = (ECPrivateKey) keyPair.getPrivate();
            // 2. 执行签名
            PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(ecPrivateKey.getEncoded());
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
            Signature signature = Signature.getInstance("SHA1withECDSA");
            signature.initSign(privateKey);
            signature.update(src.getBytes());
            byte[] arr = signature.sign();
            System.out.println("jdk ecdsa sign :" + HexBin.encode(arr));
            // 3. 验证签名
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(ecPublicKey.getEncoded());
            keyFactory = KeyFactory.getInstance("EC");
            PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
            signature = Signature.getInstance("SHA1withECDSA");
            signature.initVerify(publicKey);
            signature.update(src.getBytes());
            boolean bool = signature.verify(arr);
            System.out.println("jdk ecdsa verify:" + bool);
        } catch (Exception e) {

        }
    }

}
