package Jan.Day20.Strings;

public class p142pingJie {
    public static void main(String[] args) {
        int[]arr1= {1,2,3};
        System.out.println(test1(arr1));

    }

    /*
拼接字符串:
        定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。
        格式参照如下:[word1#word2#word3]。

分析:
    1．首先准备一个int[]数组，内容是:1、2、3
    2．定义一个方法,用来将数组变成字符串
    三要素
        返回值类型:String
        方法名称:fromArrayToString
        参数列表:int[]
    3．格式:[word1#word2#word3]
    用到: for循环、字符串拼接、每个数组元素之前都有一个word字样、分隔使用的是#、区分一下是不是最后一个
    4．调用方法,得到返回值,并打印结果字符串

*/
    private static String test1(int[]arr1) {

        //System.out.println(arr1);//[I@119d7047
        for (int i : arr1) {
            System.out.println(i);
        }

        String str = "[";
        for (int i = 0; i < arr1.length; i++) {

            if (i== arr1.length-1){

                str +="world"+arr1[i]+"]";
            }
            else {

                str +="world"+arr1[i]+"#";
            }

        }

        return str;
    }
}
