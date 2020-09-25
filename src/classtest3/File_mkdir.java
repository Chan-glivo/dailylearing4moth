package classtest3;

import java.io.File;

public class File_mkdir {
    public static void main(String[] args) {
//test1();
test2();
    }
    public static void test1(){
        File dir=new File(".","demo");
        if (!dir.exists()){
            dir.mkdir();//创建目录
            System.out.println(dir.getName()+"创建成功");
        }else{
            System.out.println("该目录已存在");
        }
    }
    public static void test2(){
        File dir = new File("a"+File.separator+ "b"+File.separator+ "c"+File.separator+ "d"+File.separator+ "e"+File.separator+ "f");
if (!dir.exists()){
    dir.mkdir();
    System.out.println(dir.getName()+"目录创建成功");
}else{
    System.out.println("目录创建失败");
}
    }
}
