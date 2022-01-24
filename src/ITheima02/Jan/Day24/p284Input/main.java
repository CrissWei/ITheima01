package ITheima02.Jan.Day24.p284Input;

import java.io.FileInputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        //复制绝对路径
        FileInputStream fis = new FileInputStream("L:\\IdeaProjects\\ITheima\\fos.txt");

        //一次读一个字节，不是一个字节数组
        int by;
        while ((by= fis.read())!=-1){
            System.out.print((char) by);
        }

        //关闭资源
        fis.close();
    }
}
