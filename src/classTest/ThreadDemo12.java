package classTest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo12 {
    /*
    * 线程池
    * jdbc数据源 连接池 聚集在一起 类似于公交总站
    * 线程解决的2个问题
    * 1.靠你告知线程的数量 因为线程多了，内存就开销大
    * 线程越多，cpu切换就过于频繁，拖慢系统响应
    * 重复使用
    * */
    public static void main(String[] args) {
//        固定的线程池
        ExecutorService Thread = Executors.newFixedThreadPool(2);
//    run 实现runable
        for (int i = 0; i <5; i++) {
            Runnable runn=new Runnable() {
                @Override
                public void run() {
//                    Thread D= Thread.currentThread();
                }
            };
        }

    }
}
