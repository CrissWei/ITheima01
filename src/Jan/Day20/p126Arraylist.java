package Jan.Day20;

public class p126Arraylist {
    public static void main(String[] args) {

        test1();

    }

    private static void test1() {
        Person[] people = new Person[3];

        Person p1 = new Person("迪丽热巴", 18);
        Person p2 = new Person("古力娜扎", 19);
        Person p3 = new Person("努尔扎哈", 20);

        people[0]=p1;
        people[1]=p2;
        people[2]=p3;
        System.out.println(people);

        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[2]);
    }
}
