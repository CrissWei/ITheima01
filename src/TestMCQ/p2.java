package TestMCQ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) throws FileNotFoundException {
        new Scanner("temp.txt");
        //new Scanner(temp.txt)
        new Scanner(new File("temp.txt"));
        //new Scanner(File("temp.txt"));
    }
}
