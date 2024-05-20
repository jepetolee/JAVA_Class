package April26th;
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




