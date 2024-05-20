package May17th;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTrain2 {
    public static void main(String args[]) {
        BiFunction<Integer,Integer,Integer> func = (x, y)-> x+y;
        System.out.println(func.apply(10,30));
    }
}
