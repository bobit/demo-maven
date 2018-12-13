/**
 * Thread.join实现原理:调用wait方法
 *
 * @Author: zhangb
 * @Date: 2018/12/12 15:41
 */
public class ThreadExample {
    public static void main(String args[]) throws InterruptedException {
        // todo
//        threadJoin();

        //测试线程等待
        threadWait();
    }


    static class TestWaitExample {
        Object lock = new Object();

        public void doLock() throws InterruptedException {
            synchronized (lock) {
                lock.wait();
            }
        }
    }

    private static void threadWait() throws InterruptedException {
        System.out.println("before");
        new TestWaitExample().doLock();
        System.out.println("after");
    }

    private static void threadJoin() throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            System.out.println("thread1");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("thread2");
        });

        Thread thread3 = new Thread(() -> {
            System.out.println("thread3");
        });
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
    }


}
