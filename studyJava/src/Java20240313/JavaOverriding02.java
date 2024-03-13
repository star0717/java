package Java20240313;

class Animal{
    void cry(){}
}
class Bird extends Animal{
    void cry(){
        System.out.println("짹짹");
    }
}

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

public class JavaOverriding02 {
    public static void main(String[]args){
        //#1 각각의 타입으로 선언 + 각각의 타입으로 객체 생성
        Animal aa = new Animal();
        Bird bb = new Bird();
        Cat cc = new Cat();
        Dog dd = new Dog();

        aa.cry(); // 출력 없음
        bb.cry(); // 짹짹
        cc.cry(); // 야옹
        dd.cry(); // 멍멍

        //#2. Animal 타입으로 선언 + 자식클래스 타입으로 생성
        Animal ab = new Bird();
        Animal ac = new Cat();
        Animal ad = new Dog();
        ab.cry();
        ac.cry();
        ad.cry();
        System.out.println();

        //#3. 배열로 관리
        Animal[] animals = {ab, ac, ad};
        for(Animal animal : animals) {
            animal.cry();
        }

    }
}
