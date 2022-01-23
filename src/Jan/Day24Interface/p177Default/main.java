package Jan.Day24Interface.p177Default;

public class main {
    public static void main(String[] args) {
        new MyinterfaceAimpl().methodAbs1();
        new MyinterfaceAimpl().methodAbs2();

        new MyinterfaceAimpl().methodUpdate();//接口升级新加的方法
        System.out.println("=============");

        new MyinterfaceAimpl2().methodAbs1();
        new MyinterfaceAimpl2().methodAbs2();

        new MyinterfaceAimpl2().methodUpdate();//接口升级新加的方法
        System.out.println("=============");

    }
}
