package Jan.Day22Inheritance.p156Super;

public class Son extends Father{
    int num=20;
    public void methodSon(){
        int num =30;

        System.out.println(num);//30本类的本方法局部变量local variable
        System.out.println(this.num);//20本类成员变量  instance variable
        System.out.println(super.num);//10父类 super
    }
}
