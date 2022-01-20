package Jan.Day20.Arraylist;

import java.util.ArrayList;

public class p131 {
    public static void main(String[] args) {
    test1();


    }
//自定义4个学生对象,添加到集合,并遍历。I
    private static void test1() {

        Student s1 = new Student("Cris1",10);
        Student s2 = new Student("Cris2",20);
        Student s3 = new Student("Cris3",30);

        ArrayList<Student> array = new ArrayList<>();
        array.add(s1);
        array.add(s2);
        array.add(s3);
        System.out.println(array);
        System.out.println("=========");

        //增强for遍历， 无索引
        for (Student student : array) {
            System.out.println(student);
        }
        System.out.println("==========");

        //遍历带索引
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

}
