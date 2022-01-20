package Jan.Day20.Strings;

import java.util.Scanner;

/*
*题目:
键盘输入一个字符串,并且统计其中各种字符出现的次数。种类有:大写字母、小写字母、数字、其他
思路:
    1．既然用到键盘输八，肯定是scanner
    2．键盘输入的是字符串，那么: String str = sc.next( );
    3．定义四个变量,分别代表四种字符各自的出现次数。
    4．需要对字符串一个字、一个字检查，String-->char[]，方法就是toCharArray()
    5．遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作。
    6．打印输出四个变量,分别代表四种字符出现次数。
*

* */
public class p143Counting {
    public static void main(String[] args) {

        test1();
    }

    private static void test1() {
        //定义四个变量,分别代表四种字符各自的出现次数。
        int num=0; //数字0-9
        int numLower=0;//小写字母
        int numUpper=0;//大写字母
        int numOthers=0;//其他符号

        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        // String --->char[]
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if ('a'<=aChar && aChar<='z'){
                numLower++;
            } else if ('A'<=aChar && aChar<='Z'){
                numUpper++;
            } else if ('0'<=aChar && aChar<='9'){
                num++;
            } else {
                numOthers++;
            }
        }
        System.out.println("数字："+num);
        System.out.println("小写："+numLower);
        System.out.println("大写："+numUpper);
        System.out.println("其他："+numOthers);
    }
}
