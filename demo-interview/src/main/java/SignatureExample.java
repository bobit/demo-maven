import javax.xml.bind.DatatypeConverter;
import java.security.*;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
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
        jdkDSA();
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
}
