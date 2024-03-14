package Java20240314.SuperKeywordNMethod;

class AA{
    AA(){
        this(3);
        System.out.println("A - 1");
    }
    AA(int a){
        System.out.println("A - 2");
    }
}

class BB extends AA{
    BB(){
      this(3);
      System.out.println("B - 1");
    }
    BB(int a){
        System.out.println("B - 2");
    }
}


public class SuperMethod01 {
    public static void main(String[]args){
        AA aa1 = new AA();
        System.out.println();
        AA aa2 = new AA(3);
        System.out.println();

        BB bb1 = new BB();
        System.out.println();
        BB bb2 = new BB(3);

    }
}
