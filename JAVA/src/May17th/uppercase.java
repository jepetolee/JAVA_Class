package May17th;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class uppercase      {
    static public void main(String args[]) {
        List<String> list = Arrays.asList("kim", "Park", "he", "I", "Hello", "World");

        List<String> result = list.stream()
                .filter(p -> p.length() >= 3)
                .map(p -> p.toUpperCase())
                .collect(Collectors.toList());

        result.forEach(System.out::println);

    }
}
