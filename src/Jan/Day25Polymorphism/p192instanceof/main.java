package Jan.Day25Polymorphism.p192instanceof;

public class main {
    public static void main(String[] args) {
        Animal animal= new Cat();
        animal.eat();

        if (animal instanceof Cat ){
            Cat cat = (Cat) animal;//是小写的animal不是大写的
            cat.walk(); //特有方法
        }




    }
}
