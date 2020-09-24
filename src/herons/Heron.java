package herons;
//抽象类 目的：就是让子类继承，并且可以让子类重写其中的某些抽象方法
//这类 一般是类的顶端。 比如：开启，关闭。


public abstract class Heron {
    private  String name;

    public Heron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   //抽象方法，作用：在本类中不起作用
//    抽象方法一定要在抽象方法中
//抽象类 一定是某些类的父类
    public abstract   void one();
    public abstract   void two();
    public abstract   void three();
//    就像类可以有正常的方法！！
}
