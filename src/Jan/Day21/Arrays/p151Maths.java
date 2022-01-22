package Jan.Day21.Arrays;
/*
* 获取绝对值。
*   public static double abs ( double num):
*
* 向上取整。
*   有多种重载。public static double ceil(double num):
*
* 向下取整。
    public static double floor ( double num):
*
* 四舍五入。
*   public static long round ( double num):
*/
public class p151Maths {
    public static void main(String[] args) {
        System.out.println(Math.abs(-5.2));
        System.out.println(Math.ceil(5.2));
        System.out.println(Math.floor(5.2));
        System.out.println(Math.round(5.2));
    }
}
