package classTest;

import java.util.ArrayList;
import java.util.List;

/*
* 获取List的子集
* 集合要用类
* */
public class List_SubList {
    public static void main(String[] args) {
        List<Integer>  list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        System.out.println("大集合是:"+list);
//        获取子集，如范围内的
        List<Integer> subList1 =new ArrayList<>();
         subList1=list.subList(3,8);
        //修改子集中的数据 乘2
        for (int i = 0; i <list.size() ; i++) {
            list.set(i,list.get(i)*2);
        }
        System.out.println("变大之后的集合："+list);
//      按范围 删除
        list.subList(2,9).clear();
        System.out.println(list);

    }
}
