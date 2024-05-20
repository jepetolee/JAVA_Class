package May17th;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FloatinPoint {
    public static void main(String[] args) {
        // 예제 리스트
        List<Integer> intList = List.of(1, 2, 3, 4, 5);

        Function<Integer, Double> func1 = Math::sqrt;
        List<Double> collect1 = intList.stream().map(func1).collect(Collectors.toList());
        System.out.println(collect1);
    }
}

