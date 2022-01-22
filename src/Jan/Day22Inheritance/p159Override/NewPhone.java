package Jan.Day22Inheritance.p159Override;

public class NewPhone extends Phone{

    //直接输入show,send,or call这些继承过来的方法名称，会有提示的
    @Override
    public void show() {
        super.show();
        System.out.println("show name");
        System.out.println("show picture");
    }
}
