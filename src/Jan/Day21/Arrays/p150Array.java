package Jan.Day21.Arrays;

import java.util.Arrays;

public class p150Array {
    public static void main(String[] args) {
        test1();

    }

//请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列,并倒序打印。
    private static void test1() {
        String line = "asjdoja324u8A79YTDFY82";
        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        String s = Arrays.toString(chars);
        System.out.println(s);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }



    }
}
