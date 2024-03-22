/*
Copyright (c) 2024 jepetolee
Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;



//Tip: 무한 루프   for(;;)
public class March22th {
    public static void main(String[] args) {
        isTriangleExist();
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

    public static void wonCounting(){

        Scanner ScanningInteger = new Scanner(System.in);

        System.out.println("금액을 넣어주세요");

        int IntegerVariable;
        IntegerVariable = ScanningInteger.nextInt();

        int[] Moneytypes ={50000,10000,5000,1000,500,100,50,10};
        String[] MoneyName ={"오만원권","만원권","오천원권","천원권","오백원","백원","오십원","십원"};

        for(int iter =0; iter<8;iter++){
            System.out.print(MoneyName[iter]);
            System.out.print(": ");
            System.out.println(IntegerVariable/ Moneytypes[iter]);
            IntegerVariable %= Moneytypes[iter];
        }
        return;
    }
    public static void isTriangleExist(){

        Scanner ScanningInteger = new Scanner(System.in);

        System.out.println("삼각형이 존재하는 지 확인해볼 변수 3개를 입력하시오: ");

        int IntegerVariable[]= new int[3];
        IntegerVariable[0] =ScanningInteger.nextInt();
        IntegerVariable[1] =ScanningInteger.nextInt();
        IntegerVariable[2] =ScanningInteger.nextInt();

        Arrays.sort(IntegerVariable);
        if(IntegerVariable[2]<=IntegerVariable[0]+IntegerVariable[1]){
            System.out.println("삼각형이 존재합니다.");
        }
        else{
            System.out.println("삼각형이 존재하지 않습니다.");
        }
        return;
    }

   /*
    과제, 마무리해오기
   public static void isBoundingBoxTouched(){

        Scanner ScanningInteger = new Scanner(System.in);

        System.out.println("삼각형이 존재하는 지 확인해볼 변수 3개를 입력하시오: ");

        int[][][] Boxes= new int[2][2][2];

        for(int indexOfBox =0;iindexOfBox++)

        Arrays.sort(IntegerVariable);
        if(IntegerVariable[2]<=IntegerVariable[0]+IntegerVariable[1]){
            System.out.println("삼각형이 존재합니다.");
        }
        else{
            System.out.println("삼각형이 존재하지 않습니다.");
        }
        return;
    }

    */



}
