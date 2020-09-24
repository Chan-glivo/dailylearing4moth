package classtest3;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        //关联源
        File src=new File("D:\\untitled\\src\\classtest3\\a.txt");
        //关联目的
        File desc=new File("D:\\untitled\\src\\classtest3\\b.txt");
        //获取源文件的大小
        long length = src.length();
        //开两条线程，并分配下载任务
        DowdFile dowfile= new DowdFile(0,src,length/2,desc);
        DowdFile dowfile2= new DowdFile(length/2,src,length-(length/2),desc);
        dowfile.start();
        dowfile2.start();
//        boolean alive = dowfile.isAlive();
//        boolean alive2= dowfile2.isAlive();
//        String  nameid=dowfile.getName();
//        String  nameid2=dowfile2.getName();
//        System.out.println("A:"+alive);
//        System.out.println("B:"+alive2);
//        System.out.println("A:"+nameid);
//        System.out.println("B:"+nameid2);
    }
}
