package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {
        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
        test8();
    }
    public static void test1() {
        List test1 = new ArrayList<Homework>();
        Homework homework1 = null;
        homework1 = new Homework("张三", 25, "男", 5000, "2006-02-15");
        test1.add(homework1);
        System.out.println(test1);
    }


    public static void test2() {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        Collection c3 = new ArrayList();
        c1.add("one");
        c1.add("two");
        c1.add("four");
        c2.add("five");
        c2.add("two");
        c2.add("six");
        c1.addAll(c2);//将c2元素添加到c1中
        c3.add("one");
        c3.add("five");
        System.out.println("c1是否包含集合c3的所有元素  " + c1.containsAll(c3));
        c1.remove("two");
        System.out.println(c1);
    }

    public static void test3() {
        String[] a = new String[]{"1", "$", "2", "$", "3", "$", "4"};
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, a);
//        for循环
        for (int i = 0, l = list1.size(); i < l; ++i) {
            if (list1.get(i) == "$") {
                list1.remove(i);
                --l;
                --i;
            }
        }
        System.out.println(list1);
//        迭代器
        Iterator<String> iterator=list1.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("$".equals(next)) {
                iterator.remove();
            }
        }
        System.out.println(list1);
    }

    public static void test4() {
        String[] a = new String[]{"one", "two", "three", "four"};
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, a);
        System.out.println(list1.get(1));
        list1.set(3, "3");
        list1.add(1, "2");
        list1.remove(2);
        System.out.println(list1);
    }

    public static void test5() {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list1.add(i, i);
        }
        for (int f = 0; f < 10; f++) {
            if (list1.get(f) == 3 || list1.get(f) == 4 || list1.get(f) == 5 || list1.get(f) == 6) {
                list2.add(list1.get(f));
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        for (int h = 0; h < 10; h++) {
            if (list1.get(h) == 7 || list1.get(h) == 8 || list1.get(h) == 9) {
                list2.add(list1.get(h));
            }
        }
    }

    public static void test6() {
        List<Integer> list1 = new ArrayList<Integer>();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            list1.add(i, i);
        }
        for (int i = 0; i < list1.size(); i++) {
            arr[i] = list1.get(i);
        }
//        int[] arr = list1.stream().mapToInt(i->i).toArray();
        System.out.println(arr);


    }

    public static void test7() {
        List<Integer> list1 = new ArrayList<Integer>();
        Random r = new Random(1);
        int t=0;
        for (int i = 0; i < 1000; i++) {
            int max=10,min=1;
            int ran2 = (int) (Math.random()*(max-min)+min);
            if (ran2==0){
                System.out.println(ran2);
                break;
            }


//            list1.add(r.nextInt(100));
//            System.out.println(Math.random());
        }
//       Collections.sort(list1);// 正序
//       Collections.reverse(list1);//反转倒叙
//        System.out.println(list1);
    }

public static void test8() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    Scanner scan = new Scanner(System.in);

    List<Date> list = new ArrayList<Date>();

    for(int i=0;i<3;i++){

        System.out.println("请输入第:"+(i+1)+"个日期:(yyyy-MM-dd格式)");

        String str = scan.nextLine();

        Date date = sdf.parse(str);

        list.add(date);

    }

    //输出集合中的日期

    System.out.println("输出集合中的日期:");

    for(Date date : list){

        System.out.println(sdf.format(date));

    }

    Collections.sort(list);

    System.out.println("排序后输出集合中的日期:");

    for(Date date : list){

        System.out.println(sdf.format(date));

    }
}

    }














