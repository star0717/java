package Java20240313;

class orA{
    void print(){
        System.out.println("A class");
    }
}
class orB extends orA{
    @Override
    void print(){
        System.out.println("B class");
    }
}

public class JavaMethodOverriding {
    public static void main(String[]args){
        orA aa = new orA();
        aa.print();

        orB bb = new orB();
        bb.print();

        orA ab = new orB();
        ab.print();
    }
}
