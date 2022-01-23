package Jan.Day24Interface.p181Private;
/*
* /*
问题描述:
我们需要抽取一个共有方法methodCommon();用来解决两个默认方法之间【重复代码】的问题。
但是这个共有方法不应该让实现类使用，应该是私有化的。

解决方案:
从Java9开始,接口当中允许定义私有方法。
    1.普通私有方法,解决多个默认方法之间重复代码问题

    2.静态私有方法，解决多个静态方法之间重复代码问题


* */
public interface InterfacePrivateA {
    public default void method1(){
        System.out.println("默认方法1");
       methodCommon();
    }
    public default void method2(){
        System.out.println("默认方法2");
       methodCommon();
    }
    //使用private修饰，只给本类的method1,method2使用，而不给实现类去使用这个私有方法
     private void methodCommon(){
        System.out.println(111);
        System.out.println(222);
        System.out.println(333);
    }
}
