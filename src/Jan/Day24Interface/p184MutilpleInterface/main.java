package Jan.Day24Interface.p184MutilpleInterface;

public class main {
    public static void main(String[] args) {
        Impl impl = new Impl();
        impl.methodA();
        impl.methodB();
        impl.methodSame();
        impl.methodDefault();
        System.out.println("==============");


        Son son = new Son();
        son.methodFather(); //当父类和接口的方法名是一样时，优先父类，然后才是接口
    }
}
