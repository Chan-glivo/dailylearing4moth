package classtest3;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机对鞋效率查，块读写效率高
 * 所以若希望提高读写效率，可以提高每次读写的数据量
 * 以此减少读写次数
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("D:\\untitled\\src\\classtest3\\a.txt", "r");
        RandomAccessFile desc = new RandomAccessFile("D:\\untitled\\src\\classtest3\\b.txt", "rw");
        /*
         * RandomAccessFile 提供了一次读写一组字节的方法
         * int ready（byte[] data）
         * 一次性读取给定字节数组length的字节两，并存入到该数组中
         * 返回值为实际读取到的字节量
         * 若返回值为-1，则表示本次没有读到任何字节，时文件的末尾。
         *
         *
         * void write(byte [] data)
         * 将给定的字节数组中所有字节一次性写出
         *
         *
         * void write(byte[] data,int offset ,int len)
         * 将给定字节数组从下标offset处的字节开始的连续len个一次性写出
         * */
        byte[] data = new byte[1024 * 10];
        int len = -1;
        //记录每次读取到的字节量
        long start = System.currentTimeMillis();
        while ((len = src.read(data)) != -1) {
            desc.write(data, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！：" + (end - start) + "ms");
        src.close();
        desc.close();


    }
}
