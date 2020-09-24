package classTest;
/*静态方法使用synchronized，那么一定具有同步效果
 * 静态方法上锁的对象，试该方法所属类的类对象！
 * 实际上JVM在加载一个类的class文件时，会实例话一个Class类型的实例去保存
 * 该类信息(属性，方法等)
 * 所以JVM中每个加载过的类都有且只有一个Class的实例用与表达它
 * 这个类Class的实例就是类对象
* */
public class ThreadDemo13 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
                Boo.doSome();
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                Boo.doSome();
            }
        };
t1.start();
t2.start();
    }
}
class Boo{
    public synchronized static void doSome()  {
        Thread t=Thread.currentThread();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+"正在运行");
    }

};
