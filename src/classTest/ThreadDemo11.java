package classTest;

public class ThreadDemo11 {
   /* synchronized 锁
   *
   *
   * */
   public static void main(String[] args) {
//       所在不同的位置..不一样的效果和效率
       Shop shop=new Shop();
       Thread t1=new Thread(){
           @Override
           public void run() {
               try {
                   shop.buy();//选 试 （衣服） 结账
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       };
       Thread t2=new Thread(){
           @Override
           public void run() {
               try {
                   shop.buy();//选 试 （衣服） 结账
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       };
       t1.start();
       t2.start();
   }
}
/*
* synchronized 同步块可以更精确的控制需要同步执行的代码片段
* 有效缩小同步范围，可以提高并发效率
* 需要注意点：上锁的对象，要保证同步运行的代码片段试线程中的同一个对象
*
* */
class Shop{
    public  void buy() throws InterruptedException {
        Thread t= Thread.currentThread();
        System.out.println(t.getName()+"赵露丝  正在选衣服");
         Thread.sleep(5000);
        synchronized(this){System.out.println(t.getName()+"正在试衣服");
            Thread.sleep(5000);}
        System.out.println(t.getName()+"结账 离开");

    }



}

