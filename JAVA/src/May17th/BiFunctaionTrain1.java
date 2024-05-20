package May17th;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class BiFunctaionTrain1 {
    public static void main(String args[]) {
        Function<String,Integer> func = (x)-> x.length();
        System.out.println(func.apply("Hello"));
    }
}
