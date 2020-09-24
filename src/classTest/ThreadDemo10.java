package classTest;
/*
* 认识线程
* 当多个线程并发访问同一资源时
* 由于线程切换实际不缺确定，导致代码没有按照设计的跪着来执行，就会出现卡顿的现象
* */
public class ThreadDemo10 {
    //main方法其实也是一个线程 延伸一下：session
    public static void main(String[] args) {
        BaBy baBy= new BaBy();
     Thread t1=new Thread(){
       @Override
        public void run() {
           while(true){
               try {
                   Thread.sleep(2000);
                   int zhenjing = baBy.getZhenjing();
                   System.out.println("发运强盗了"+getName()+"   "+zhenjing);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }

    }
};

        Thread t2=new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(2000);
                        int zhenjing = baBy.getZhenjing();
                        System.out.println("照亮强盗了"+getName()+"  "+zhenjing);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        };
t1.start();
t2.start();
    }
//原因1：一步运行：就是没有先后顺序，各干各的
    }
 class BaBy{
    private  int zhenjing=20;
//    线程锁！！当一个方法被 synchronized 修饰后，那么该方法
//     成为”同步方法“，即：多个线程不能同时进入到方法内部执行。
    public  synchronized  int getZhenjing(){
        if (zhenjing==0){
            System.out.println("真的被抢光了.....");
            throw new RuntimeException("没有经书l");
        }else {
            zhenjing--;
        }
        Thread.yield();//模拟线程切换
        return zhenjing;
    }
}
