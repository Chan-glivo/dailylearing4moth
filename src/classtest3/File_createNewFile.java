package classtest3;

import java.io.File;
import java.io.IOException;

public class File_createNewFile {
    public static void main(String[] args) throws IOException {
        /*
        * 在当前目录下创建一个文件
        * */
        File file= new File(".",File.separator+"test.txt");
        /*
        * boolean exists()
        * 判断当前File我表示的文件或目录是否真实存在
        * */
        if (!file.exists()){
            /*
            * 创建该文件
            *boolean  isHidden()是否隐藏
            *
            * */
            file.createNewFile();
            file.isHidden();
            System.out.println("创建完毕！");
        }else{
            System.out.println("该文件已存在");
        }
    }

}
