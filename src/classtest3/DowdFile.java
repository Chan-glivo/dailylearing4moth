package classtest3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DowdFile extends Thread{
private  long start;
private File src;
private long total;
private File desc;
/*
* @param start 开始下载的位置
* @param src 要下载的文件
* @param desc 要下载的目的地
* @param total 要下载的总量
*
* */
    public DowdFile( long start, File src, long total, File desc) {
        this.start = start;
        this.src = src;
        this.total = total;
        this.desc = desc;
    }

    @Override
    public void run() {
        try {
            //创建输入流关联员，因为要指定位置读和写，所以我们需要用随机访问流
            RandomAccessFile src=new RandomAccessFile(this.src,"rw");
            RandomAccessFile desc=new RandomAccessFile(this.desc,"rw");
            //源和目的都要从start开始
            src.seek(start);
            desc.seek(start);
            //开始读写
            byte[] arr=new byte[1024];
            int len;
            long count=0;
            long start= System.currentTimeMillis();
            while ((len=src.read(arr))!=-1){
                //分三种情况
                if (len+count>total){
                    //当读取的时候操作自己该线程的下载总量的时候，需要改变len
                    len=(int)(total-count);
                    desc.write(arr,0,len);
                    //证明该吸纳成下载任务已经完毕，技术读写操作
                    break;
                }else if (len+count<total){
                    //证明还没有到下载总量，直接将内容写入
                    desc.write(arr,0,len);
                    //并且使计算器任务累加
                    count+=arr.length;
                    break;
                }else{
                    //证明刚好到下载总量
                    desc.write(arr,0,len);
                    break;
                }


            }
            long end =System.currentTimeMillis();
            System.out.println("复制完毕！："+(end-start)+"ms");
            src.close();
            desc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
