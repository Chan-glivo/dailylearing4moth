package classTest;

public class Test {
    public static void main(String[] args) {
        People P1=new Hejiu("张三","男");
        People P2=new Chouyan("LAOWANG","NV");
        System.out.println(P1.getName()+P1.getSex());
        System.out.println(P2.getName()+P2.getSex());
        Hejiu H1=new Hejiu("张三","男");
        H1.hejiu();
    }
}
