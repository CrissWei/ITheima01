package TestMCQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class p6 {

    /*
    写出在0-255之间生成1个随机整数的语句。将数字转换为二进制，
    并将其存储为一个8位数组。然后，显示二进制数
     */
    public class Test {
        public static void main(String[] args) {
            // 创建随机数对象，取0-255的随机数
            Random random = new Random();
            int res = random.nextInt(256);

            // 调用方法得到二进制
            ArrayList<Integer> integers = getIntegers(res);
            int size = integers.size();

            // 需要向前补0的个数
            int zero = 8 - size;

            // 定义8位数组
            Integer[] arr = new Integer[8];

            // 得到符合条件的8位数数组
            for (int i = 0; i < arr.length; i++) {
                if (i < zero) {
                    arr[i] = 0;
                    continue;
                }
                arr[i] = integers.get(i - zero);
            }

            // 将8位数组转为10进制数字
            String sum = "";
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            int sumInt = Integer.parseInt(sum); // sumInt即为转换结果

            // 调用十进制转二进制方法，传入得到的十进制数即可
            ArrayList<Integer> integers1 = getIntegers(sumInt);
            System.out.println(integers1);
        }

        /**
         * 十进制转二进制
         *
         * @param res
         * @return
         */
        private static ArrayList<Integer> getIntegers(Integer res) {
            // 定义remainder接收余数
            int remainder;

            // 定义集合
            ArrayList<Integer> integers = new ArrayList<>();

            while (true) {
                if (res == 0) {// 结束循环
                    break;
                }
                remainder = res % 2;
                integers.add(remainder);
                res = res / 2;
            }

            // 将集合反序排列即为二进制
            Collections.reverse(integers);
            return integers;
        }
    }
}
