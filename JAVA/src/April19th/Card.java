package April19th;

public class Card {
    String CardType;
    int CardNumber;

    String CardName;

    public Card(String cardType, int cardNumber){
        this.CardType = cardType;
        this.CardNumber= cardNumber;
        if (this.CardNumber == 1){
            this.CardName =this.CardType+" "+"에이스";
        }
        else if (this.CardNumber == 11){
            this.CardName =this.CardType+" "+"잭";
        }
        else if (this.CardNumber == 12){
            this.CardName =this.CardType+" "+"퀸";
        }
        else if (this.CardNumber == 13){
            this.CardName =this.CardType+" "+"킹";
        }
        else{
            this.CardName =this.CardType+this.CardNumber;
        }
    }
    public String getCardName(){
        return this.CardName;
    }

}
