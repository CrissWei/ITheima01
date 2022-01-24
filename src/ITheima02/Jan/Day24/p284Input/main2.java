package ITheima02.Jan.Day24.p284Input;

import java.io.FileInputStream;
import java.io.IOException;

public class main2 {
    public static void main(String[] args) throws IOException {
        //复制绝对路径
        FileInputStream fis = new FileInputStream("L:\\IdeaProjects\\ITheima\\fos.txt");

        //一次读一个字节，不是一个字节数组
        int len;
        byte data [] =new byte[1024];
        while ((len= fis.read())!=-1){
            System.out.print(new String(data,0,len));//为什么输出没内容啊
        }

        //关闭资源
        fis.close();
    }
}
