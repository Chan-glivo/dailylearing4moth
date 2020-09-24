package classTest;
/*
* 线程创建的第二种方式，接口
*
* */
public class ThreadDemo03 {
    public static void main(String[] args) {
        //创建线程接口
        Runnable r1= new Xicai();
        Runnable r2= new Water();
        //创建线程
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        //启动线程
        t1.start();
        t2.start();

    }
}
