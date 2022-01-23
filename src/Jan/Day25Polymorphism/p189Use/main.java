package Jan.Day25Polymorphism.p189Use;
/*
*
访问成员变量的两种方式:
    1．直接通过对象名称访问成员变量:看等号左边是谁，优先用谁，没有则向上找。
    2．间接通过成员方法访问成员变量:看该方法属于谁，优先用谁，没有则向上找。

 【自己的总结】当Father and Son里面方法名词一样时，
     * 方法看“=”右边，也就是new谁就用谁的方法，   一般是调用子类方法
     * 成员变量看“=”左边                        一般是访问父类成员变量
     *
     * 如果不知道可以摁住alt+鼠标右键点击num/method，就可以看到底这个成员变量是来自哪里了

*/
public class main {
    public static void main(String[] args) {
        Son son = new Son();
        son.method();
        System.out.println(son.num);

        //p192子类特有方法
        son.methodSon();


        System.out.println("===========多态Polymorphism====");

        Father poly = new Son();
        poly.method();
        System.out.println(poly.num);


        //poly.methodSon();错误，需要向下转型，
        int num = (int) 10.0;//类似double-->(double) int强转

        //p192 向下转型
        //Son son2 = (Son) Father;//这个为什么不对啊，老师也是这样的没错啊


    }
}
