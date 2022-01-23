package Jan.Day24Interface.p184MutilpleInterface;

public interface InterfaceA {
    public abstract void methodA();
    public abstract void methodSame();

    public default void methodDefault(){
        System.out.println("接口内的默认方法");
    }

/////////////////////
    public default void methodFather(){
        System.out.println("Interface Father!!!");
    }
}
