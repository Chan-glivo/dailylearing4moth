package classtest3;

import java.io.File;

public class File_delete {
    public static void main(String[] args) {
        /*
         * 将当前目录中的test.txt文件删除
         * */
        File file = new File("." + File.separator + "test.txt");
        if (file.exists()) {
//            删除指定文件
            file.delete();
            System.out.println("该文件已删除！");
        } else {
            System.out.println("该文件不存在");
        }
    }
}
