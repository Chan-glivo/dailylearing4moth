package classTest;
/*
* StringBuilder类
* 为了解决频繁修改字符串带来的性能问题，消耗资源的问题。
* */
public class SBdemo1 {
    public static void main(String[] args) {
//        字符串，有增删改查
        StringBuilder sbl=new StringBuilder();
        String str="努力学Java";
        sbl=sbl.append(str+",将来走上人生的巅峰");
        System.out.println(sbl);
        StringBuilder sbl1=new StringBuilder();
        sbl1=sbl.reverse();
        System.out.println("sbl1反转"+sbl1);
        System.out.println("sbl1再反转"+sbl1.reverse());

        sbl=sbl.replace(0,2,"我要");//修改替换，含头去除尾
        System.out.println(sbl);
        StringBuilder insert=new StringBuilder();
        insert=sbl.insert(8,"是");//插入
        System.out.println(insert);
        StringBuilder delete=new StringBuilder();
        delete=sbl.delete(0,7);//删除  含头不含尾
        StringBuilder deleteall=new StringBuilder();
        deleteall=sbl.delete(0,sbl.length());

    }
}
