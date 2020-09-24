package classtest3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/*
* 复制文件
* */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=new RandomAccessFile("D:\\untitled\\src\\classtest3\\a.txt","r");
        RandomAccessFile desc=new RandomAccessFile("D:\\untitled\\src\\classtest3\\b.txt","rw");
        int d=-1;//记录每次读取到的字节
        long start =System.currentTimeMillis();
        while ((d=src.read())!=-1){
            desc.write(d);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕！耗时："+(end-start)+"ms");
        src.close();
        desc.close();
    }
}
