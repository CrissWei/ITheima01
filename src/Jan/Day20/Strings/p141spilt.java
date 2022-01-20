package Jan.Day20.Strings;

public class p141spilt {
    public static void main(String[] args) {
        test1();
    }

    //按照“+”切割字符串，变为字符串数组  String[]
    private static void test1() {
        String s1 = "a+bb+ccc+dddd";
        // 使用\\+ ，前面\\不变,后面加想要的分割字符，这里是加号【+】 也可改为逗号【,】等等
        String[] split = s1.split("\\+");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split.length);
        System.out.println("==============");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
