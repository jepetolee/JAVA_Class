package April5th;

public class MiniCar extends Car{
    String Color;
    float speed;

    public MiniCar(String color, float speed) {
        super(color, speed);
    }

    public void Car(String color, float speed){
        this.Color = color;
        this.speed=speed;
    }
    void carAccelerate(){
        speed +=5;
    }
    void breakPaddle(){
        speed -=12;
    }
}