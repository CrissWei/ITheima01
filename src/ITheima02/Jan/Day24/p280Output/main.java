package ITheima02.Jan.Day24.p280Output;

import java.io.FileOutputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        //右键复制绝对路径
        FileOutputStream fos = new FileOutputStream("L:\\IdeaProjects\\ITheima\\fos.txt");
        fos.write(97);
        fos.close();
    }
}
