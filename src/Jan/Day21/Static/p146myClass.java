package Jan.Day21.Static;

public class p146myClass {

    private int num;
    private static int numStatic;

    public void method1(){
        System.out.println("普通方法");

        //非静态可以访问静态static的成员方法和成员变量
        System.out.println(num);
        System.out.println(numStatic);

    }
    public static void methodStatic(){
        System.out.println("静态方法");

        //静态不能方法非静态
        System.out.println(numStatic);
    }
}
