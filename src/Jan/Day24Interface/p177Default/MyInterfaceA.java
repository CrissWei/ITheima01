package Jan.Day24Interface.p177Default;

public interface MyInterfaceA {
    public abstract void methodAbs1();
    void methodAbs2();  //public abstract 也可以省略不写

    //接口升级，多增加一个默认方法，不是abstract方法，是普通的
    public default void methodUpdate(){
        System.out.println("接口升级新的方法");

    }
}
