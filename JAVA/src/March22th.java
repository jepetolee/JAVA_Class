import java.util.Scanner;
import java.lang.Math;

public class March22th {
    public static void main(String[] args) {
        printDivisor();
        return;
    }
    public static void isOddOrEven(){

        Scanner ScanningInteger = new Scanner(System.in);

        System.out.println("아무 정수나 넣어보세요");

        int IntegerVariable;
        IntegerVariable = ScanningInteger.nextInt();
        if (IntegerVariable %2 ==0)
            System.out.println("짝수");
        else
            System.out.println("홀수");
        return;
    }

    public static void isThreesMultiply(){

        Scanner ScanningInteger = new Scanner(System.in);

        System.out.println("아무 정수나 넣어보세요");

        int IntegerVariable;
        IntegerVariable = ScanningInteger.nextInt();
        if (IntegerVariable %3 ==0)
            System.out.println("3의 배수");
        else
            System.out.println("3의배수가 아님.");
        return;
    }

    public static void isPrime(){

        Scanner ScanningInteger = new Scanner(System.in);

        System.out.println("아무 정수나 넣어보세요");

        int IntegerVariable;
        IntegerVariable = ScanningInteger.nextInt();
        Double DoubleVersionOfInt = Double.valueOf(IntegerVariable);
        Double RootOfInt = Math.sqrt(DoubleVersionOfInt);

        for (int iter=2;iter<=RootOfInt;iter++){
            if (IntegerVariable%iter==0){
                System.out.println("소수가 아님");
                return;
            }
        }
        System.out.println("소수임.");
        return;
    }

    public static void printDivisor(){

        Scanner ScanningInteger = new Scanner(System.in);

        System.out.println("아무 정수나 넣어보세요");
        int IntegerVariable;
        IntegerVariable = ScanningInteger.nextInt();


        Double DoubleVersionOfInt = Double.valueOf(IntegerVariable);
        Double RootOfInt = Math.sqrt(DoubleVersionOfInt);

        System.out.print(1);
        System.out.print(" ");
        System.out.print(IntegerVariable);
        System.out.print(" ");

        for (int iter=2;iter<=RootOfInt;iter++){
            if (IntegerVariable%iter==0){
                if (iter == IntegerVariable/iter){
                    System.out.print(iter);
                }
                else{
                    System.out.print(iter);
                    System.out.print(" ");
                    System.out.print(IntegerVariable/iter);
                    System.out.print(" ");
                }
            }
        }
        return;
    }

    public static void RockSissorPaper(){

        Scanner ScanningInteger = new Scanner(System.in);

        System.out.println("가위는 0, 바위는 1, 보는 2, 하나 둘 셋 가위 바위 보:");
        int IntegerVariable;
        IntegerVariable = ScanningInteger.nextInt();

        int Selection = (int)(Math.random()*3);
        System.out.println(Selection);

        if (Selection == IntegerVariable){
            System.out.println("무승부");
        }
        else if ((Selection ==0 && IntegerVariable==1)||(Selection ==1 && IntegerVariable==2)||(Selection ==2 && IntegerVariable==0)){

            System.out.println("당신의 승리.");
        }
        else{
            System.out.println("당신의 패배");
        }
        return;
    }

    public static void printPreviousPrime(){

        Scanner ScanningInteger = new Scanner(System.in);

        System.out.println("아무 정수나 넣어보세요");

        int IntegerVariable;
        IntegerVariable = ScanningInteger.nextInt();

        int[] PrimeNumberList = new int[999999];
        PrimeNumberList[0] =1;

        int iterationOfPrimNumber =0;

        for (int iter=2; iter<=IntegerVariable; iter++){
            int countsOfDivisor =0;
            for (int primeIndex=0; primeIndex <iterationOfPrimNumber+1;primeIndex++ ){
                if(iter%PrimeNumberList[primeIndex]==0){
                    countsOfDivisor ++;
                }
                if(countsOfDivisor>1){
                    break;
                }
            }
            if(countsOfDivisor==1){
                PrimeNumberList[++iterationOfPrimNumber] = iter;
                System.out.print(iter);
                System.out.print(" ");
            }
        }
        return;
    }
}
