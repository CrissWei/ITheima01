package Jan.Day20.Arraylist;

import java.util.ArrayList;
import java.util.Random;

/*生成6个1~33之间的随机整数,添加到集合,并遍历集合。
* */
public class p130 {
    public static void main(String[] args) {
        test1();

    }

    private static void test1() {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int num = new Random().nextInt(32)+1;
            integers.add(num);
            System.out.println("Random num:"+num);
        }
        System.out.println("================");
        System.out.println(integers);
        System.out.println("=================");

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }

    }
}
