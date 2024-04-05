package April5th;

public class Dice {
    int face;
    public Dice(){
        face=0;
    }
    public void Roll(){
        face = (int)(Math.random()*6)+1;
    }
    public int getValue(){
        if (face==0)
            System.out.println("UNROLLED DICE");
        return face;
    }
}

