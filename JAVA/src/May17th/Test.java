package May17th;

import java.util.function.BiFunction;
import java.util.function.Predicate;

@FunctionalInterface
interface test
{
    float calculate(int x,int y);
}



public class Test
{
    public static void main(String args[]) {
        int value1=8,value2 = 9;
        BiFunction<Integer,Integer,Float> s = (x, y)-> (float)x*y;
        float y = s.apply(value1,value2);
        Predicate<Integer> k = (v) -> v%2==0;
        System.out.println(y);
        System.out.println(k.test(9));
    }
}