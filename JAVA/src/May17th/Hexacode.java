package May17th;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Color {
    String name;
    String hexaCode;
    Color(String name, String hexaCode){
        this.name= name;
        this.hexaCode= hexaCode;
    }
    public String getName() {
        return name;
    }
}


public class Hexacode {
    static public void main(String args[]){
        List<Color> list = new ArrayList<Color>();

        Color red = new Color("Red", "#FF0000");
        Color blue = new Color("Blue", "#0000FF");
        Color white = new Color("White", "#FFFFFF");
        Color green = new Color("Green", "#008000");

        list.add(red); list.add(blue); list.add(white); list.add(green);

        List<String> res = list.stream()
                .map(c -> c.getName())
                .sorted((c1, c2) -> c1.compareTo(c2))
                .collect(Collectors.toList());

        res.forEach(System.out::println);


    }


}
