package Jan.Day20.Strings;

import java.nio.charset.StandardCharsets;

public class p140CharAt {
    public static void main(String[] args) {

        //test1();
        //test2();
        test3();
    }

    //系统自动替换脏字，敏感词替换为****
    private static void test3() {
        String s1= "how do you do";
        String s2 = s1.replace('o', '*');
        System.out.println(s1);
        System.out.println(s2);
    }

    //getBytes在IO流里面经常使用
    private static void test2() {
        String s1 = "Hello";
        byte[] bytes = s1.getBytes();
        System.out.println(bytes);//[B@119d7047

        //遍历
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==========");

        //遍历
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

    }

    //把字符串变成单个的字节数组
    private static void test1() {
        String s1 = "Hello";
        char[] chars = s1.toCharArray();
        System.out.println(chars);//Hello
        System.out.println(chars[0]);//H
        System.out.println(chars[1]);//e
        System.out.println(chars.length);//5
        System.out.println("=======");
    }
}
