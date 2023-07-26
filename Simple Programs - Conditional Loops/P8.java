//Given String is Palindrome or not (Jigar == ragiJ)
import java.util.*;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String s = sc.nextLine();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("Given String is Not Palindrome");
                System.exit(1);
            }
            i++;
            j--;
        }
        System.out.println("Given String is Palindrome");
        sc.close();

    }

}
