package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();

    }
     public static void test1(){
        String str1="HelloWorld";
         System.out.println(str1.length());
         System.out.println(str1.charAt(0));
         System.out.println(str1.indexOf("o",5));
         System.out.println(str1.substring(0,5));
         System.out.println(str1.substring(5,str1.length()));
         String str2="Hellold";
         System.out.println(str2.trim());
         System.out.println(str1.charAt(5));
         //endwith
         if (str1.charAt(0)=='H'&& str1.substring(8,str1.length()).equals("ld")){
             System.out.println("是");
         }else {
             System.out.println("不是");
         }
         System.out.println(str1.toUpperCase());
         System.out.println(str1.toLowerCase());
    };
     public static void test2(){
         String str3="大家好";
         StringBuilder sbl=new StringBuilder();
         StringBuilder sbl1=new StringBuilder();
         sbl.append(str3+"我是程序员！");
         System.out.println(sbl);
         sbl1=sbl.insert(4,"牛牛的");//插入
         System.out.println(sbl1);
         System.out.println(sbl1.delete(0,3));
     };
     public static void test3(){
         Scanner str4=new Scanner(System.in);
         String str5=str4.next();
         int int1=str5.lastIndexOf("@");
         System.out.println(str5.substring(0,int1));

     };
     public static void test4(){
//         ceshi();
         ran();
     }

    private static void ran() {
        Scanner str4=new Scanner(System.in);
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <5; i++) {
            if(random.nextInt(2)==0){
                sb.append((char)('a'+random.nextInt(26)));
            }else {
                sb.append((char)('A'+random.nextInt(26)));
            }
        }
        System.out.println("请输入验证码"+sb);
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        if (input.toUpperCase().equals(sb.toString().toUpperCase())) {
            System.out.println(true);

        }else{
            System.out.println(false);
            ran();
        }
    }

    private static void ceshi() {
        String str7="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Scanner str4=new Scanner(System.in);
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i <5 ; i++) {
            int num=random.nextInt(52);
            sb.append(str7.charAt(num));
        }
        System.out.println("验证码："+sb);
        String  str9=sb.toString();
        String DX=str9.toUpperCase();
        String dx=str9.toLowerCase();
        System.out.println("请你输入验证码");
        String  str8=str4.next();
        if(str8.toUpperCase().equals(DX)||str8.toLowerCase().equals(dx)){
            System.out.println("你验证码正确");
        }else{
            System.out.println("验证码输入错误");
            ceshi();
        }
    };
     public static void test5(){
         jisuan();
     }

    private static void jisuan() {
        Scanner str4=new Scanner(System.in);
        System.out.println("请输入你的表达式");
        String str1=str4.next();
        int int1=str1.indexOf("+");
        int int2=str1.indexOf("-");
        int int3=str1.indexOf("*");
        int int4=str1.indexOf("/");
        double num1=0;
        double num3=0;
        int num2=0;
        if (int1>0){
             num1=Double.parseDouble(str1.substring(0,int1));
             num3=Double.parseDouble(str1.substring(int1+1,str1.length()));
             num2=str1.charAt(int1);
        }else if (int2>0){
             num1=Double.parseDouble(str1.substring(0,int2));
             num3=Double.parseDouble(str1.substring(int2+1,str1.length()));
             num2=str1.charAt(int2);
        }else if (int3>0){
             num1=Double.parseDouble(str1.substring(0,int3));
             num3=Double.parseDouble(str1.substring(int3+1,str1.length()));
             num2=str1.charAt(int3);
        }else if (int4>0){
             num1=Double.parseDouble(str1.substring(0,int4));
             num3=Double.parseDouble(str1.substring(int4+1,str1.length()));
             num2=str1.charAt(int4);
        }else{
            System.out.println("你输入的表达式有问题");
        }
        switch (num2){
            case'+':
                System.out.println(num1+num3);
                jisuan();
                break;
            case'-':
                System.out.println(num1-num3);
                jisuan();
                break;
            case'*':
                System.out.println(num1*num3);
                jisuan();
                break;
            case'/':
                System.out.println(num1/num3);
                jisuan();
                break;
        }
    }

    ;
}
