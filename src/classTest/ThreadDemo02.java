package classTest;
/*
* 线程 1.需要继承一个线程
* */
public class ThreadDemo02 extends Thread  {
    public static void main(String[] args) {
        //怎么使用 多态
        //电子设备 x= new Iphone;
        Thread t1=new Water1();
        Thread t2=new Xicai1();
        t1.start();
        t2.start();




    }
}
