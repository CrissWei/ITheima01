package Jan.Day24Interface.p184MutilpleInterface;

public interface InterfaceB {
    public abstract void methodB();
    public abstract void methodSame();

    public default void methodDefault(){
        System.out.println("接口内的默认方法");
    }
}
