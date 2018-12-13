import ch.qos.logback.core.util.TimeUtil;

import java.util.concurrent.TimeUnit;

/**
 * 如何停止一个线程
 * 不建议直接stop
 * 建议：通过自身检查，去处理
 * 1.interrupt isInterrupt()
 * 2. volatile boolean stop
 *
 * @Author: zhangb
 * @Date: 2018/12/12 15:19
 */
public class InterruptExample {

    private static int i;
    //volatile 保证线程的可见性
    private volatile static boolean stop = false;

    public static void main(String args[]) throws InterruptedException {
        // todo
        stopThread();
//        stopThread2();
    }

    public static void stopThread() throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("num-" + i);

        });

        thread.start();
        TimeUnit.SECONDS.sleep(2);
//        thread.interrupt();//interrupt = true
    }


    public static void stopThread2() throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!stop) {
            }
        });

        thread.start();
        TimeUnit.SECONDS.sleep(2);
        //改变共享变量的值，让线程可见
        stop = true;
    }
}
