package classTest;

import org.omg.PortableServer.THREAD_POLICY_ID;

/*
* 认识线程
* 当进程结束的时候，守护线程就结束了》》》
* */
public class ThreadDemo08 {
    //main方法其实也是一个线程 延伸一下：session
    public static void main(String[] args) {
        Thread rousi=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("肉丝：你白过来，过来我就跳了");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("aaaaa");
                System.out.println("死掉了.....好可惜");
            }
        };
Thread jieke = new Thread(){
    @Override
    public void run() {
        while (true){
            System.out.println("夹克说：嫩白跳，嫩跳了，俺也跳，要死一起死");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
};
        boolean alive=jieke.isAlive();
        System.out.println("杰克是否死了"+alive);

//给夹克变成添购，变为守护线程
jieke.setDaemon(true);
rousi.start();
jieke.start();
    }
}
