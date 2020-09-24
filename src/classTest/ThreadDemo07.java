package classTest;
/*
* 认识线程
* 一个线程可以中断另一个线程
*
* */
public class ThreadDemo07 {
    //线程被中断
    public static void main(String[] args) {
        //当前线程
       Thread water=new Thread(){
           @Override
           public void run() {
               System.out.println("烧水》》");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("不打了....");
           }
       };
       Thread xicai =new Thread(){
           @Override
           public void run() {
               try {
                   Thread.sleep(4000);
                   System.out.println("游戏4秒后，你刚进去排位");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("朋友说：玩啥玩，给我洗菜去。。");
               water.interrupt();//线程被中断
           }
       };
water.start();
xicai.start();



    }
}
