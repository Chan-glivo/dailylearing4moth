package classTest;

import java.util.ArrayList;
import java.util.Collection;

/*
* 集合存放的是什么，对象的引用*/
public class CollectionDemo1 {

    public static void main(String[] args) {
        Person p1=new  Person();
        Collection collection =new ArrayList();
//        放对象

        p1.setAge(20);
        p1.setSex(1);
        System.out.println(collection.add(p1));
        System.out.println(collection);
    }
    }
      class Person{
        private  int age;
        private int sex;



        public Person(int age, int sex) {
            this.age = age;
            this.sex = sex;
        }

          public Person() {

          }

          public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }
    }

