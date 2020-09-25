package classTest;

import java.util.*;

public class List_add_remove {
    public static void main(String[] args) {
//      jichu();
//      get_set();
//      addAll();
        c_C();
    }
    public static  void jichu(){
        List<String> strList= new ArrayList<String>();
        strList.add("one");
        strList.add("two");
        strList.add("three");
        strList.add("four");
        strList.add("five");
//        给指定元素插入到索引位置
        strList.add(1,"2");
//        remove 移除 还能把删除的元素回显
        String remove = strList.remove(2);
        System.out.println(remove);
        System.out.println(strList);
    }
    public  static void get_set(){
//        get() 拿
        List<String> strList= new ArrayList<String>();
        strList.add("one");
        strList.add("two");
        strList.add("three");
        strList.add("four");
        strList.add("five");
        System.out.println(strList.get(1));
        /*for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }*/
        for (String a:strList) {
            System.out.print(a);
        }
//    set  一般没有追加的功能，只有替换/修改的功能和add的最大区别
        String tu = strList.set(1,"tu");
        System.out.println(strList);
        System.out.println(tu);
    }
    public  static void addAll(){
        Collection collection = new HashSet();
        collection.add("java");
        collection.add("c++");
        collection.add("php");
        System.out.println(collection);
        Collection collection2= new HashSet();
        collection2.add("C#");
        collection2.add(".net");
        collection2.add("java");
        System.out.println(collection2);
//collection1全部添加到c2中
        System.out.println(collection2.addAll(collection));
        System.out.println(collection2);
//        contains 包含 判断 这个集合中是否包含该元素
        Collection c3=new ArrayList();
        ((ArrayList)c3).add("c#");
        boolean b1=collection2.containsAll(c3);
        System.out.println(b1);
      boolean b2= collection2.removeAll(c3);
        System.out.println(b2);
        System.out.println(collection2);
    }
    public static  void c_C(){
        /*
        * contains 包含
        * contains 判断包含条件是：
        * */
        Collection c=new ArrayList();
        c.add(new Human("CHEN",10,0));
        c.add(new Human("CHENA",10,1));
        c.add(new Human("CHENB",10,0));
        Human h=new Human("CHEN",10,0);
        System.out.println(c.contains(h));
    }
}
