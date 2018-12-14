package design.patterns.factory;

/**
 * 工厂模式
 *
 * @Author: zhangb
 * @Date: 2018/12/13 23:13
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
