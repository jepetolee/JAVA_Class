package May3rd;
import java.util.Scanner;
public class ArrayIndexBounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        int[] count = new int[26];

        for (char ch : input.toCharArray()) {
            try {
                ch = Character.toLowerCase(ch);
                count[ch - 'a']++;
            }
            catch (ArrayIndexOutOfBoundsException e){
                  //e.printStackTrace();
                  System.out.println(ch +"는 영문자가 아닙니다!");
            }

        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + count[i] + "회");
            }
        }

        scanner.close();

    }
}
