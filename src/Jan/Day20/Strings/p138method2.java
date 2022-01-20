package Jan.Day20.Strings;

import java.nio.charset.StandardCharsets;

public class p138method2 {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        test4();
    }

    //获取字符/数字，在原始字符串str1首次出现的索引号
    private static void test4() {
        String str1 = "HelloWorld";
        System.out.println(str1.indexOf(4));//-1
        System.out.println(str1.indexOf("llo"));//2
        System.out.println(str1.indexOf("lol"));//-1

    }

    //获取指定索引位置的的单个字符
    private static void test3() {
        String str1 = "HelloWorld";
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));

    }

    //拼接字符串concat
    private static void test2() {

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1.concat(s2);
        System.out.println(s3);//HelloWorld

    }

    //获取String length
    private static void test1() {

        int length = "sajdladlahfoanbfga".length();
        System.out.println("长度：" + length);
        System.out.println("===========");
    }
}
