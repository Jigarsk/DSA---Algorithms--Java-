import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Principle Amount");
        int P = input.nextInt();
        System.out.println("Please enter Time of Interest in Years");
        int T = input.nextInt();
        System.out.println("Please enter Time of Rate of Interest in %");
        int R = input.nextInt();
        int sum = P * T * R;
        int Interest = sum / 100;
        System.out.println("Interest is " + Interest);
    }
}

