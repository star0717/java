package Java20240315.AbstractModifier01;

//class Animal{
//   void cry(); => error!
//   abstract void cry(); => 추상메서드를 선언했지만 클래스도 추상클래스로 선언해야 정상 작동됨
//}

abstract class Animal{
    abstract void cry();
}
// => 추상클래스, 추상메서드

class Cat extends Animal{
    void cry(){
        System.out.println("야옹");
    }
}

class Dog extends Animal{
    void cry(){
        System.out.println("멍멍");
    }
}

class Bird extends Animal{
    void cry(){
        System.out.println("짹짹");
    }
}
public class AbstractModifier01 {
    public static void main(String[]args){
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Bird();

        animal1.cry();
        animal2.cry();
        animal3.cry();
    }
}
