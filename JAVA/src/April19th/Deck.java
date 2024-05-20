package April19th;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class MyList<Object> extends LinkedList<Object> {
    public Iterator<Object> iterator() {

        MyList<Object> list = this;
        Iterator<Object> it = new Iterator<Object>() {
            private int pointer = -1;

            public boolean hasNext() {
                if (pointer < (list.size() - 1)) return true;
                return false;
            }

            public Object next() {
                pointer++;
                Object element;
                try {
                    element = list.get(pointer);
                } catch (IndexOutOfBoundsException exception) {
                    throw new NoSuchElementException(exception.getMessage());
                }
                return element;
            }

            public void remove() {
                if (-1 < pointer && pointer < list.size()) {
                    list.remove(pointer);
                    pointer--;
                    return;
                }
                throw new IllegalStateException();
            }
        };

        return it;
    }

}





public class Deck {
    MyList<Card> cardArrayList =new MyList<Card>();
    public Deck(){
        for(int iter=1; iter<=13;iter++){
            Card savingCard = new Card("클럽",iter);
            cardArrayList.add(savingCard);
        }
        for(int iter=1; iter<=13;iter++){
            Card savingCard = new Card("다이아몬드",iter);
            cardArrayList.add(savingCard);
        }
        for(int iter=1; iter<=13;iter++){
            Card savingCard = new Card("하트",iter);
            cardArrayList.add(savingCard);
        }
        for(int iter=1; iter<=13;iter++){
            Card savingCard = new Card("스페이드",iter);
            cardArrayList.add(savingCard);
        }
    }
    public void __str__(){
        System.out.print("[");
        for(int iter=0; iter<cardArrayList.size();iter++){
            System.out.print(cardArrayList.iterator().hasNext());
            System.out.print(cardArrayList.get(iter).getCardName());
            if(iter!=cardArrayList.size()-1){
                System.out.print(", ");
            }

        }
        System.out.print("]");
    }
}
