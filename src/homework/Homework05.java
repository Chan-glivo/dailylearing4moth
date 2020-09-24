package homework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) throws IOException {
//        test1();
          test2();
//        test3();
    }
    public static void test1(){
        File f=new File("D:\\untitled\\src\\classtest3\\a.txt");
        System.out.println(f.getName());
        System.out.println(f.length());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(f.lastModified()));
    }
    public static void test2() throws IOException {
        Scanner scn=new Scanner(System.in);
        System.out.println("请你输入文件名");
        String str=scn.next();
        File f=new File(".",File.separator+str+".txt");
        boolean ex=f.exists();
        if (!ex){
            f.createNewFile();
            System.out.println("创建成功");
        }if (ex){
            System.out.println("文件已存在,创建副本");
            for (int i = 0; i <10; i++) {
                File f1=new File(".",File.separator+str+"_副本"+i+".txt");
               boolean ex1=f1.exists();
                if (!ex1){
                f1.createNewFile();
                    System.out.println("创建副本成功");
                    break;
                }else {
                    continue;
                }
            }
        }
    }
    public static void test3(){
        File file=new File("D:\\untitled\\src\\homework");
        if (file.isDirectory()){
               File[] filelist=file.listFiles();
            System.out.println("所有目录"+filelist.length+"子文件");
            for (File i:filelist){
                if (i.isDirectory()){
                    System.out.println("目录");
                }if(i.isFile()){
                    System.out.println("文件");
                }
                System.out.println(i.getName());
            }
        }


        }




}
