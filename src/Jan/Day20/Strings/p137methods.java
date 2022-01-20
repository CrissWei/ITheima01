package Jan.Day20.Strings;

public class p137methods {
    public static void main(String[] args) {
        testP137();
        testP138();
    }

    private static void testP138() {

    }

    private static void testP137() {
        String str1 = "Hello";
        String str2 = "Hello";

        char[]chars = {'H','e','l','l','o'};
        String str3 = new String(chars);

        String str4 = "hello";

        System.out.println(str1.equals(str2));//True
        System.out.println(str1.equals(str3));//T
        System.out.println(str1.equals(str4));//False
        System.out.println("Hello".equals(str1));//T
        System.out.println(str1.equalsIgnoreCase(str4));//T

        System.out.println("========");

        System.out.println(str1==str2);//True
        System.out.println(str1==str3);//F
        System.out.println(str1==str4);//F

        System.out.println("=============");

        //////////推荐常量写前面，变量写后面，因为变量有可能是null，会报错
        String A= null;
        System.out.println(str1.equals(A));//False   【推荐】
        System.out.println(A.equals(str1));//报错    【不推荐】
    }
}
