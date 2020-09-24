package classTest;

public class Xicai implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            //睡眠1秒
            try {
                Thread.sleep(10);
                System.out.println("洗菜过了" + i + "秒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
