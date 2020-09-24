package classTest;
/*
* 线程创建的第二种方式，接口
*
* */
public class ThreadDemo04 extends Thread {
    public static void main(String[] args) {
        //匿名内部类
        Thread t2=new Thread(){
            @Override
            public void run() {
                //模拟烧水
                for (int i =1; i <=10; i++) {
                    //睡眠1秒
                    try{
                        Thread.sleep(1000);
                        System.out.println("烧水过了"+i+"秒");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.start();
        Thread t1=new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    //睡眠1秒
                    try {
                        Thread.sleep(1000);
                        System.out.println("洗菜过了" + i + "秒");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
       t1.start();


       //第三种
        Thread t4=new Thread(new Runnable() {
            @Override
            public void run() {
                //模拟烧水
                for (int i =1; i <=10; i++) {
                    //睡眠1秒
                    try{
                        Thread.sleep(1000);
                        System.out.println("烧水过了"+i+"秒");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        );
//        t4.start();
        Thread t5=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    //睡眠1秒
                    try {
                        Thread.sleep(1000);
                        System.out.println("洗菜过了" + i + "秒");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
//        t5.start();
    }
}
