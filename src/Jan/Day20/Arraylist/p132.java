package Jan.Day20.Arraylist;

import java.util.ArrayList;


/*
 定义以指定格式打印集合的方法(ArrayList类型作为参数)，
 使用{}大括号括起集合，使用@分隔每个元素。格式参照 {元素@元素@元素}
 例如：
System.out.printLn(list);   //[10，20，30]
printArrayList(list);       //{10@20@30}
*/
public class p132 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("张3丰");
        strings.add("张4丰");
        strings.add("张5丰");
        System.out.println(strings);//[张3丰, 张4丰, 张5丰]
        printArray(strings);
    }

    private static void printArray(ArrayList<String> strings) {


        for (int i = 0; i < strings.size(); i++) {
            if (i==0){
                System.out.print("{"+strings.get(i));
            }
            else {
                System.out.print("@"+strings.get(i));
            }
        }
        ////////////
        System.out.println("}"); //{张3丰@张4丰@张5丰}

    }
}
