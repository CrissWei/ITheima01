package Jan.Day24Interface.p184MutilpleInterface;

//同时实现2个不同的接口A,B;;所有的类Class都默认extends Object
public class Impl /*extends Object */implements InterfaceA,InterfaceB{
    @Override
    public void methodA() {
        System.out.println("AAA");
    }

    @Override
    public void methodB() {
        System.out.println("BBB");
    }

    @Override
    public void methodSame() {
        System.out.println("覆盖重写了AB都有的相同名词的方法");

    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写接口的默认default方法");
    }
}
