package Jan.Day22Inheritance.p154Format;

public class p154main {
    public static void main(String[] args) {
        new Dean().method();//继承父类Employee
        new Dean().methodDean();

        System.out.println("=========");

        new Teacher().method();//继承父类Employee
        new Teacher().MethodTeacher();

    }
}
