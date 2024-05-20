package May17th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class lowercase {


     public static void main(String args[]) {
          List<String> list = Arrays.asList(new String[]{"A", "B", "C"});

          Function<String, String> func = String::toLowerCase;
          ArrayList<String> collect = list.stream().map(func).collect(Collectors.toCollection(ArrayList::new));
          Iterator iter = collect.iterator();           //Iterator를 사용하는 경우

          while (iter.hasNext()) {
               System.out.print(iter.next() + " ");   //1 2 3 4 5
          }
     }
}
