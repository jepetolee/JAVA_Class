package April19th;

public class Main {
    public static void main(String[] args) {
        deck();
    }
    public static void deck() {
     Deck TrumpCard =new Deck();
     TrumpCard.__str__();
    }
    public static void playGame(){
        TextGame game = new TextGame();
        game.main();
    }
}
