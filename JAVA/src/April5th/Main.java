package April5th;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        library();
    }

    public static void dice(){
        Dice dice1 = new Dice(), dice2 = new Dice();

        dice1.Roll();
        dice2.Roll();

        int faceOfDice1 = dice1.getValue(),faceOfDice2 = dice2.getValue();

        int countingNumbers=1;
        while((faceOfDice1!=1)&&(faceOfDice2!=1)){
            System.out.println("("+faceOfDice1+ " , "+ faceOfDice2+")");
            countingNumbers++;
            dice1.Roll();
            dice2.Roll();
            faceOfDice1 = dice1.getValue();
            faceOfDice2 = dice2.getValue();
        }
        System.out.println("("+faceOfDice1+ " , "+ faceOfDice2+")");
        System.out.println("(1 , 1) 이 나올 때까지 걸린시간 "+countingNumbers);

    }
    public static void Array(){
        int[] list= new int[9];
        for( int i=0;i<9;i++)
            list[i] = i*4;
        int BestValue = getMax(list);
        System.out.println(BestValue);
    }
    public static int getMax(int[] Array){
        int Best=-9999;
        for( int i=0;i<9;i++)
            if(Best < Array[i])
                Best = Array[i];
        return Best;
    }

    public static void library(){
        LibrarySystem library =new LibrarySystem();
        Scanner sc = new Scanner(System.in);

        while(true){
            if(sc.nextInt() == 1){
                System.out.println("책 입력");
                String bookName = sc.next();
                int Value =sc.nextInt();
                library.addBook(bookName,Value);
            }
            if(sc.nextInt() == 2){
                library.callBookList();
            }
            if(sc.nextInt() == 3){
                String bookName = sc.next();
                library.searchBook(bookName);
            }
            if(sc.nextInt() == 99)
                System.exit(0);
        }
    }
}
