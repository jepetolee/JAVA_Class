package April5th;
import java.util.ArrayList;

public class LibrarySystem {
    static int count;
    ArrayList<Book> bookList ;

    public LibrarySystem(){
       this.bookList=  new ArrayList<Book>();
    }

    public void addBook(String Name, float Point){
        bookList.add(new Book(Name,Point));
        count++;
    }
    public void searchBook(String bookName){
        for (int iter=0;iter<count;iter++){
            if(bookList.get(iter).bookName.equals(bookName)){
                System.out.println("해당 도서가 존재합니다.");
                System.out.println(bookList.get(iter).Points);
            }
        }
    }
    public void callBookList(){
        for (int iter=0;iter<count;iter++){
            System.out.println(bookList.get(iter).bookName);
            System.out.println(bookList.get(iter).Points);
        }
    }

}
