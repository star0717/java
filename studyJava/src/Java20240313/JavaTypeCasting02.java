package Java20240313;

// 캐스팅의 가능 여부를 확인할 수 있는 instanceof
class C{}
class D extends C{}
public class JavaTypeCasting02 {
    public static void main(String[]args){
        C cc = new C();
        C cd = new D();

        System.out.println(cc instanceof C);
        System.out.println(cd instanceof C);

        System.out.println(cc instanceof D);
        System.out.println(cd instanceof D);

        if (cc instanceof D){
            D d = (D) cc;
            System.out.println("cc casting by D");
        } else {
            System.out.println("cc can't casting of D type");
        }

        if (cd instanceof D){
            D d = (D) cd;
            System.out.println("cd casting by D");
        } else {
            System.out.println("cd can't casting of D type");
        }

        if ("hello" instanceof String){
            System.out.println("\"hello\" is String class");
        }
    }
}
