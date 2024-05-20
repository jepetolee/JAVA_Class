package May10th;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;

public class Set {
    static public void main(String[] args){
        HashSet<String> s1 = new HashSet<String>(Arrays.asList("A","B","C"));
        HashSet<String> s2 = new HashSet<String>(Arrays.asList("A","D"));

        HashSet<String> union = new HashSet<String>(s1);
        union.addAll(s2);

        HashSet<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2);
        System.out.println(union);
        System.out.println(intersection);
    }
}
