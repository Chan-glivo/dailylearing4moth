package classTest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringDemo1 {
    static String[] arr={"http://fl.orcale.sser.com?id=8","http://yyywfong.orcale.werwerr.com?id=8","http://werrwrrwewerwerwe.orcale.78543244.com?id=8"};
    static String[] split1;
    static int t=-1;
    public static void main(String[] args) {
//       Test1();
/*//        长度
        String  str="HelloWord";
        System.out.println("长度是："+str.length());
//        string 还可以查找字符串出现的位置
        String str1="thinking in java";
        int in= str1.indexOf("in");
        System.out.println(in);
//        查最后一次出现的位置
        int in1=str1.lastIndexOf("in");
        System.out.println(in1);
        int in2=str1.indexOf("in",4);
        System.out.println(in2);
//       截取 常用的字段
        String url = "www.oracle.com"; //含头去尾巴
        String substring = url.substring(4,10);
        System.out.println(substring);
//        test
        String url1 = "www.oracle.com?id=8"; //含头去尾巴
        String substring1 = url1.substring(15,19);
        System.out.println(substring1);*/
        // 练习+作业;
        // 练习:  //  http://fl.orcale.sser.com?id=8
        // 练习:  //  http://yyywfong.orcale.werwerr.com?id=8
        // 练习:  //  http://werrwrrwewerwerwe.orcale.78543244.com?id=8   .... 50个...
      /*  String  url="http://yyywfong.orcale.werwerr.com?id=8";
//        第一个点出现的位置
        int in=url.indexOf(".");
        *//*System.out.println(in);*//*
//        第二个点出现的位置
        int in2=url.indexOf(".",in+1);
//        System.out.println(in2);
//        第三个出现的位置
        int in3=url.indexOf(".",in2);
        int in1=url.lastIndexOf(".");
        *//*System.out.println(in1);*//*
        String substring1 = url.substring(in2+1,in1);
        System.out.println(substring1);*/
        /*for (int i = 0; i <arr.length ; i++) {
            String url=arr[i];
            int in=url.indexOf(".");
            int in2=url.indexOf(".",in+1);
            int in1=url.lastIndexOf(".");
            String substring1 = url.substring(in2+1,in1);
            System.out.println(substring1);
        }
*/
//        charAt()按索引位置查字符
      /*  String sss="01021029";
        String str5="hello word";
        char c= str5.charAt(6);
        System.out.println(c);*/
//        回文 奶牛产牛奶
       String str6="上海自来水来自海上";
        for (int i = 0; i < str6.length(); i++) {
            int LastIndex=str6.length()-1;
            int num=0;
            t=t++;
            int t=-1;

            String str= str6.substring(t+1,t+2);
            if (str.equals(str6.charAt(LastIndex))){
                System.out.println(num+1);
            }else {
                System.out.println("erro");
            }
        }

//        字符串拼接间的赋值变化差别
       /* String strr1="helloword";
        String a="hello";
//        +=进行赋值
        String b=a+"word";
        String c1="hello"+"word";
        System.out.println(strr1==c1);//true
        System.out.println(strr1==b);//false*/

    }
    public static void Test1(){
        /*for (int i = 0; i <arr.length; i++) {
            String  url=arr[i];
            split1=url.split("\\.");
            System.out.println("split="+split1[2]);
        }*/
        /*String str6="上海自来水来自海上";
        for (int i = 0; i < str6.length(); i++) {
            t++;
            System.out.println(t);
            String str= str6.substring(t+1,t+2);
            System.out.println(str);
        }*/


    }

}
