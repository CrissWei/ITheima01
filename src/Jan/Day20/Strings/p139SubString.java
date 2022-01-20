package Jan.Day20.Strings;

public class p139SubString {
    public static void main(String[] args) {

        test1();
    }

    //截取字符串,左闭右开区间：[)
    private static void test1() {
        String str1 = "HelloWorld";

        //一个参数是从索引到最后一位
        String sub1 = str1.substring(4);//[4,str1.length-1]
        System.out.println(sub1);//oWorld

        //两个参数是从索引到索引-1
        String sub2 = str1.substring(4, 7);//[4,6]
        System.out.println(sub2);//oWo
    }
}
