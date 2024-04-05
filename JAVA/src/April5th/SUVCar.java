package April5th;

public class SUVCar extends Car{

    public SUVCar(String color, float speed) {
        super(color, speed);
    }

    public void Car(String color, float speed){
        this.Color = color;
        this.speed=speed;
    }
    String Color;
    float speed;
    void carAccelerate(){
        speed +=15;
    }

    void breakPaddle(){
        speed -=15;
    }

}
