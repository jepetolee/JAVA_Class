package May3rd;

public class SimplePair<T> {
   private T data1;
   private T data2;
    public SimplePair(T pair1,T pair2){
        this.data1= pair1;
        this.data2 = pair2;
    }
    public void setFirst(T data){
        this.data1= data;
    }
    public void setSecond(T data){
        this.data2= data;
    }
    public T getFirst(){
        return this.data1;
    }

    public T getSecond(){
        return this.data2;
    }
    public static void main(String[] args){
        SimplePair<String> pair = new SimplePair<String>("a", "b");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
