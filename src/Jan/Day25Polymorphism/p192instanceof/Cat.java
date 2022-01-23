package Jan.Day25Polymorphism.p192instanceof;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }
    public void walk(){
        System.out.println("jump cat!");
    }
}
