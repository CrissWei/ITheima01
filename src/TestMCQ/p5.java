package TestMCQ;

import java.util.*;
public class p5 {

    /*
    写出在0-255之间生成1个随机整数的语句。将数字转换为二进制，
    并将其存储为一个8位数组。然后，显示二进制数
     */
    public class Test {
        public static void main(String[] args) {
            // 首先得到二进制
            Random random = new Random();
            int res = random.nextInt(256);
            ArrayList<Integer> integers = getIntegers(res);
            int size = integers.size();
            System.out.println(integers);


            // 定义8位数组
            Integer[] arr = new Integer[8];
            for (int i = 0; i < arr.length; i++) {
                if (i < size) {
                    arr[i] = 0;

                    continue;
                }
                arr[i] = integers.get(i - 4);
            }
            for (Integer integer : arr) {
                System.out.println(integer);
            }

            // 将数组转集合
            List<Integer> ints = new ArrayList<>();

            // 将长度位8的集合转为10进制数字
            // 定义sum接收结果
            double sum = 0;
            for (int i = 0; i < ints.size(); i++) {
                sum = Math.pow(10, i) * ints.get(i);
            }

            ArrayList<Integer> integers1 = getIntegers((int) sum);
            System.out.println(integers1);


        }

        /**
         * 十进制转二进制
         * @param res
         * @return
         */
        private static ArrayList<Integer> getIntegers(int res) {
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
