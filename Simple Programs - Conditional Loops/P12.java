//In given number , how many times digit is being repeated.

import java.util.Scanner;

public class P12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Enter Target Digit");
        int target = sc.nextInt();
        int temp, count = 0;
        while (n > 0) {
            temp = n % 10;
            if (temp != target) {
                count = count + 0;
            } else {
                count = count + 1;
            }
            n = n / 10;

        }
        System.out.println(count);

    }
}
