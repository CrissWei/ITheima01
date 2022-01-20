package Jan.Day20.Arraylist;

import java.util.ArrayList;
import java.util.Random;

public class p133 {
    public static void main(String[] args) {
        method1();
    }
/*
题目:
用一个大集合存入20个随机数字，然后筛选其中的偶数even 元素，放到小集合当中。
要求使用自定义的方法来实现筛选。
 */
    private static ArrayList<Integer> method1() {
        ArrayList<Integer> numA = new ArrayList<>();
        ArrayList<Integer> numB = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numA.add(new Random().nextInt(100));
        }
        System.out.println(numA);
        System.out.println("total num:"+numA.size());
        System.out.println("============");


        for (int i = 0; i < numA.size(); i++) {
            //System.out.println(numA.get(i));

            if (numA.get(i)%2==0){
                numB.add(numA.get(i));
            }
        }
        System.out.println(numB);
        System.out.println("num of even:"+numB.size());

        return numB;

    }
}
