package April5th;


public class Car {
    String Color;
    float speed;

    public Car(String color, float speed){
        this.Color = color;
        this.speed=speed;
    }
    void carAccelerate(){
        speed +=10;
    }

    void breakPaddle(){
        speed -=20;
    }

}




