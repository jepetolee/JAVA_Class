package April26th;

interface P1{
    void Papa();
    default void callMe(){
        System.out.println("1");
    }

}
interface P2{
    void Mama();
    default void callMe(){
        System.out.println("2");
    }
}

class Me implements  P1,P2 {
    public void  Papa(){
        System.out.println("1");
    }
    public void Mama(){
        System.out.println("1");
    }
    public void callMe(){
        System.out.println("aa");
    }
}

public class Main{

    public static void main(String[] args){
        Me obj =new Me();
        obj.Mama();
        obj.Papa();
    }
}
