package classTest;
/*
* 认识线程
* join阻塞
* join();该方法会让调用这个方法的线程处于阻塞状态
* 知道该方法所属线程的结束，才会取消阻塞状态
* 用法：通常备用来协助线程之间同步运行使用
* 同步运行：就是先后顺序
* 异步运行：就是没有先后顺序，各干各自的。
* */
public class ThreadDemo09 {
    //main方法其实也是一个线程 延伸一下：session
    public static void main(String[] args) {
        Thread yuanhang=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10; i++) {
                    i++;
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("远航写完了"+i+"代码");
                }
            }
        };
Thread chaofan=new Thread(){
    @Override
    public void run() {
        for (int i = 0; i <12; i++) {
            i++;
            try {
                Thread.sleep(1000);
                System.out.println("游戏输了"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("超凡打游戏，输了12把，郁闷");
        System.out.println("想让远航参加一打游戏");
        try {
            yuanhang.join();//yuanhang 进来了
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("超凡心里很开心,脸上写满了不舍");
    }
};
yuanhang.start();
chaofan.start();

    }
}
