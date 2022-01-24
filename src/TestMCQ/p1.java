package TestMCQ;

public class p1 {
    public static void main(String[] args) {

        method1();
        method2();
    }

    private static void method2() {
        double[] marks = new double[10];
        String[] country = {"Indonesia", "Malaysia", "Singapore"};
        int[] num = {'1', '4', '6', '8'};
        char[] line = new char[50];
        double[] temp = {22.4, 12.7, 45.8, 99.2, 10.2};
    }

    private static int[][] method1() {
        //return new int[][]{ {1, 2}, {3}};
        return  new int[][]{{1, 2, 3}, {2, 4, 5}};
    }
}
