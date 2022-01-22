package Jan.Day22Inheritance.p159Override;
/*

方法覆盖重写的注意事项:
    1．必须保证父子类之间【方法的名称相同，参数列表也相同】。
        @Override:写在方法前面，用来检测是不是有效的正确覆盖重写。
        这个注解就算不写，只要满足要求，也是正确的方法覆盖重写。
    2．子类方法的返回值必须【小于等于】父类方法的返回值范围。
        小扩展提示: java.lang.Object类是所有类的公共最高父类（祖宗类)，java.lang. String就是object的子类。
    3．子类方法的权限必须【大于等于】父类方法的权限修饰符。
        public > protected> (default) > private
        备注:(default)不是关键字default，而是什么都不写，留空。
*
p158笔记如下========================
在父子类的继承关系当中，创建子类对象，访问成员方法的规则:
创建new的对象是谁,就优先用谁，如果没有则向上找。
注意事项:
    无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。
    重写(Override)
    概念,在继承关系当中，方法的名称一样，参数列表也—样。
        重写(Override): 方法的名称一样，参数列表【也一样】。覆盖、覆写。
        重载（Overload):方法的名称一样，参数列表【不一样】。

    方法的覆盖重写特点:创建的是子类对象，则优先用子类方法。
 */
public class main {
    public static void main(String[] args) {
        new Phone().call();
        new Phone().send();
        new Phone().show();
        System.out.println("=============");

        new NewPhone().call();
        new NewPhone().send();
        new NewPhone().show();

    }
}
