package May3rd;

import java.util.Scanner;
//jar cvfe Dice.jar APP * class
// java - jar Dice.jar
class Dice {
    int face;
    public Dice(){
        face=0;
    }
    public void Roll(){
        face = (int)(Math.random()*6)+1;
    }
    public void setValue(int diceValue){
        face = diceValue;
    }
    public int getValue(){
        if (face==0)
            System.out.println("UNROLLED DICE");
        return face;
    }
    public String toString(){
        return String.valueOf(face);
    }

}

public class DiceGame {
    public static void main(String[] args){
      Dice Computer=new Dice(), Player =new Dice();
      Computer.Roll();
      System.out.println("컴퓨터는 주사위를 굴렸습니다.... 당신이 원하는 주사위값을 골라주세요! 6이 넘어가는 경우 6으로 나눈 나머지, 0이면 1이 됩니다.");
      Scanner sc = new Scanner(System.in);
      int playerValue = sc.nextInt();
      if(playerValue==0){
          playerValue++;
      }
      else if(playerValue>6){
          playerValue%=6;
      }
      Player.setValue(playerValue);
      if(Player.face<Computer.face){
          System.out.println(Player.toString() +",당신의 패배 컴퓨터는 "+Computer.toString()+"입니다");
      }
      else if(Player.face== Computer.face){
          System.out.println(Player.toString() +",당신의 무승부 컴퓨터는 "+Computer.toString()+"입니다");
      }
      else {
          System.out.println(Player.toString() +",당신의 승리 컴퓨터는 "+Computer.toString()+"입니다");
      }
    }


}
