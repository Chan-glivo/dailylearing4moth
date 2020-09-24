package classtest3;

import java.io.File;

public class File_listFiles {
    public static void main(String[] args) {
        /*
        * 查看当前目录下的所有子项
        * */
        File dir=new File(".");
        /*
        * boolean isFile()
        * 判断当前File表示的是否是一个文件
        * boolean isDirectory()
        * 判断当前File表示的是否为一个目录
        */
        if (dir.isDirectory()){
            //获取该目录中的所有子项
            File[] subs=dir.listFiles();
            System.out.println("当前目录有"+subs.length+"子个项");
            for(File sub : subs){
            if (sub.isFile()){
                System.out.println("文件");
            }if (sub.isDirectory()){
                    System.out.println("目录");
                }
                System.out.println(sub.getName());
            }
        }
    }
}
