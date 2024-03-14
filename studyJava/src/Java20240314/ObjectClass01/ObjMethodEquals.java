package Java20240314.ObjectClass01;

class A{
    String name;
    A(String name){
        this.name = name;
    }
}

class B{
    String name;
    B(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if (this.name == ((B)(obj)).name){
            return true;
        }else
            return false;
    }
}
public class ObjMethodEquals {
    public static void main(String[]args){
        A a1 = new A("hi");
        A a2 = new A("hi");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        B b1 = new B("hi");
        B b2 = new B("hi");
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));

    }
}
