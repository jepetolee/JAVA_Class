package May17th;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Square {
    public int getArea(int side);
}
public class FloatinPoint2 {
    public static void main(String[] args) {
       Square area = (side) -> {return side*side;};
       System.out.println(area.getArea(1020));
    }

}
