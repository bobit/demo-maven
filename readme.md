## 掌握多线程并发与线程安全

### 线程安全性
	定义：当多个线程访问某个类时，不管运行时环境采用何种调度方式或者这些进程讲如何交替执行，并且在主调代码中不需要任何额外的同步或协同，这个类都能表现出正确的行为，那么就成这个类是线程安全的。

## 体现在三个方面
	原子性：提供了互斥访问，同一时刻只能有一个线程来对它进行操作
可见性：一个线程对主内存的修改可以及时的被其他线程观察到
有序性：一个线程观察其他线程中的指令执行顺序，由于指令重排序的存在，该观察结果一般杂乱无序

### 5大块
	J.U.C核心由5大块组成：atomic包、locks包、collections包、tools包（AQS）、executor包（线程池）。

## 实例
[demo-juc](https://github.com/bobit/demo-java/blob/master/demo-juc/src/main/java/com/demo/juc/AtomicApplication.java)

