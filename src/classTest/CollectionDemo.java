package classTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
* 集合
* 集合是用来存放一组元素，与数组功能相似。
* 集合提供了操作元素的   方法
* 集合常见的2个接口
* set————不可重复  无序
* list————可以重复  有序
* */
public class CollectionDemo {
    public static void main(String[] args) {
        //    因为集合本身是一个数组，所以使用多态ArrayList进行创建对象
        Collection collection= new ArrayList();
        collection.add("唐僧");
        collection.add("悟空");
        collection.add("八戒");
        collection.add("沙僧");
        System.out.println(collection);
//        size() 尺寸 为啥 String 的length
//        siza() 放对象 String 不变
        int size=collection.size();
        System.out.println(size);
//        判断是否为空
        boolean empty =collection.isEmpty();
        System.out.println(empty);
//        清空
        collection.clear();
        System.out.println(collection);
    }

}
