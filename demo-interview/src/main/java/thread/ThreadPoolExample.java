package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * 阻塞队列是最大是200 线程池最大数量是400 拒绝策略是线程池满了以后抛异常 问第401个线程来的时候 线程池里有几个线程
 *
 * @Author: zhangb
 * @Date: 2019/2/16 12:22
 */
public class ThreadPoolExample {


    public static void main(String[] args) throws Exception {
        testThreadPoolExecutor();
    }

    public static void testThreadPoolExecutor() throws Exception {
        //基础参数
        int corePoolSize = 2;//最小活跃线程数
        int maximumPoolSize = 5;//最大活跃线程数
        int keepAliveTime = 5;//指定线程池中线程空闲超过 5s 后将被回收
        TimeUnit unit = TimeUnit.SECONDS;//keepAliveTime 单位
        //阻塞队列 三种阻塞队列
        BlockingQueue<Runnable> workQueue = null;
        workQueue = new ArrayBlockingQueue<>(20);//基于数组的先进先出队列，有界
//        workQueue = new LinkedBlockingQueue<>();//基于链表的先进先出队列，无界
//        workQueue = new SynchronousQueue<>();//无缓冲的等待队列，无界

        //拒绝策略 四种拒绝策略
        RejectedExecutionHandler rejected = null;
        rejected = new ThreadPoolExecutor.AbortPolicy();//默认，队列满了丢任务抛出异常
//        rejected = new ThreadPoolExecutor.DiscardPolicy();//队列满了丢任务不异常
//        rejected = new ThreadPoolExecutor.DiscardOldestPolicy();//将最早进入队列的任务删，之后再尝试加入队列
//        rejected = new ThreadPoolExecutor.CallerRunsPolicy();//如果添加到线程池失败，那么主线程会自己去执行该任务

        //线程池 五种线程池
        ExecutorService threadPool = null;
//        threadPool = Executors.newCachedThreadPool();//有缓冲的线程池，线程数 JVM 控制
        threadPool = Executors.newFixedThreadPool(40);//固定大小的线程池
//        threadPool = Executors.newScheduledThreadPool(2);//创建一个定长线程池，支持定时及周期性任务执行。
//        threadPool = Executors.newSingleThreadExecutor();//单线程的线程池，只有一个线程在工作
//        threadPool = new ThreadPoolExecutor(
//                corePoolSize,
//                maximumPoolSize,
//                keepAliveTime,
//                unit,
//                workQueue,
//                rejected);//默认线程池，可控制参数比较多

        //执行无返回值线程
        TaskRunnable taskRunnable = new TaskRunnable();
        threadPool.execute(taskRunnable);
        List<Future<String>> futres = new ArrayList<>();
        for (int i = 0; i < 41; i++) {
            //执行有返回值线程
            TaskCallable taskCallable = new TaskCallable(i);
            Future<String> future = threadPool.submit(taskCallable);
            futres.add(future);
        }
        for (int i = 0; i < futres.size(); i++) {
            String result = futres.get(i).get();
            System.out.println(i + " result = " + result);
        }
    }

    /**
     * 返回值的线程，使用 threadpool.execute() 执行
     */
    public static class TaskRunnable implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " runnable result!");
        }
    }

    /**
     * 有返回值的线程，使用 threadpool.submit() 执行
     */
    public static class TaskCallable implements Callable<String> {
        public TaskCallable(int index) {
            this.i = index;
        }

        private int i;

        @Override
        public String call() throws Exception {
            int r = new Random().nextInt(5);
            try {
                Thread.sleep(r);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("callable result!");
            return Thread.currentThread().getName() + " callable index=" + i + ",sleep=" + r;
        }
    }
}
