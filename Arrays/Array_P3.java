import java.util.ArrayList;
import java.util.Scanner;

public class Array_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> jigar = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            jigar.add(sc.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(jigar.get(i));
        }
    }
}
