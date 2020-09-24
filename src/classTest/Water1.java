package classTest;
/*
* 注意：线程多注重行为... 即将来可以变成接口
* */
public class Water1 extends Thread {
    @Override
    public void run() {
//模拟烧水
        for (int i =1; i <=10; i++) {
            //睡眠1秒
            try{
                Thread.sleep(10);
                System.out.println("烧水过了"+i+"秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
