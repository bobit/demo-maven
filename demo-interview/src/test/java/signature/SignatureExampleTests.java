package signature;

import org.junit.Test;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2018/12/19 15:52
 */
public class SignatureExampleTests {

    @Test
    public void jdkECDSA() {
        SignatureExample signatureExample = new SignatureExample();
        signatureExample.jdkDSA();
    }

    @Test
    public void jdkDSA() {
        SignatureExample signatureExample = new SignatureExample();
        signatureExample.jdkECDSA();
    }


}
