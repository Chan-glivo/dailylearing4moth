package classTest;
/*
* 认识线程
* */
public class ThreadDemo06 {
//main方法是一个主线程 单线程 最安全（没有线程的收据交互）多线程就要考虑线程的安全
//安卓就是一个单线程模型，效率高，运行快
    public static void main(String[] args) {
        //当前线程
        Thread main1=Thread.currentThread();
//获取线程的id和名字
        Long id= main1.getId();
        String nameid=main1.getName();
        System.out.println("ID:"+id+"name:"+nameid);
//线程的优先级 但是优先级不靠谱
        int priority=main1.getPriority();
        System.out.println("优先级:"+priority);
//线程是不是活动状态
        boolean alive= main1.isAlive();
        System.out.println("线程的状态是："+alive);
//守护线程 精灵线程 游戏开发会用到
       boolean daemon=main1.isDaemon();
        System.out.println("是否是守护线程："+daemon);
//线程是否被中断——————很重要
        boolean interrupted =main1.isInterrupted();
        System.out.println("是否被打断："+interrupted);
    }
}
