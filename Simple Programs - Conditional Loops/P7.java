//Sum Of numbers entered by user and exit when user clicks 0 
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number, total = 0;
        do {
            System.out.println("Please enter a Number");
            Number = sc.nextInt();
            total = total + Number;

        } while (Number != 0);
        System.out.println("Sum Of Number Is " + total);

        sc.close();

    }

}