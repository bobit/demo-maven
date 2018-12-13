/**
 * 定位到死锁发生的原因，及具体位置
 * <p>
 * Thread-0获得了锁lock1，接下来期望获得锁lock2，（第20行），但是此时Thread-1获得了锁lock2，接下来期望获得锁lock2,（第37行），因而发生了死锁。
 *
 * @Author: zhangb
 * @Date: 2018/12/12 16:06
 */
public class DeadThreadExample implements Runnable {

    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    @Override
    public void run() {
        // todo
        if (username.equals("a")) {
            synchronized (lock1) {
                try {
                    System.out.println("username = " + username);
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(3000);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("按lock1->lock2的顺序执行代码");
                }
            }
        }
        if (username.equals("b")) {
            synchronized (lock2) {
                try {
                    System.out.println("username = " + username);
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(3000);

                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("按lock2->lock1顺序执行代码");
                }
            }

        }
    }

    public void setFlag(String username) {
        this.username = username;
    }

    public static void main(String[] args) {

        DeadThreadExample dt1 = new DeadThreadExample();
        dt1.setFlag("a");
        Thread t1 = new Thread(dt1);
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dt1.setFlag("b");
        Thread t2 = new Thread(dt1);

        t2.start();
    }
}