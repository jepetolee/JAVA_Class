package May3rd;
import java.util.Scanner;


 class Text{
   Scanner sc = new Scanner(System.in);
    String[] textSet;
   String text ;
    public Text(){
        text= sc.next();
         textSet= text.split(" ");
    }
    void print(){
        for (String s : textSet) {
            System.out.println(s);
        }
    }
}
public  class  TextProcessing{
     public static void main(String[] args){
         Text tt = new Text();
         tt.print();
     }
}