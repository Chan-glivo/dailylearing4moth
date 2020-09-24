package classTest;

public class ThreadDemo01 {
    public static void main(String[] args) {
        makeWater();
        makexicai();
    }
//洗菜
    private static void makexicai() {
        //洗菜五秒钟  一个线程就是一件事
        for (int i = 1; i <=10; i++) {
            //睡眠1秒
            try{
                Thread.sleep(1000);
                System.out.println("洗菜过了"+i+"秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
//烧水
    private static void makeWater(){
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
