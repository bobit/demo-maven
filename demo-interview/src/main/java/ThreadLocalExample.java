/**
 * ThreadLocal的实现原理分析
 *
 * @Author: zhangb
 * @Date: 2018/12/12 16:35
 */
public class ThreadLocalExample {
    public static int num = 0;

    public static void main(String args[]) {
        // todo
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                num += 5;
                System.out.println(Thread.currentThread().getName() + "->" + num);

            }, "Thread-" + i).start();

        }
    }
}
