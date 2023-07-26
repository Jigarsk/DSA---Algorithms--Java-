//Given Number is Armstrong or Not (153 = 1^3 + 5^3 + 3^3)
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Number");
        int Num = sc.nextInt();
        int Armstrong = 0;
        int original = Num;
        while (Num > 0) {

            int temp = Num % 10;
            temp = (int) Math.pow(temp, 3);
            Armstrong = temp + Armstrong;
            Num /= 10;
        }
        if (Armstrong != original) {
            System.out.println("Given Number is Not Armstrong");
            System.exit(1);
        }
        System.out.println("Given Number is Armstrong");
    }
}
