
import java.util.Scanner;
public class P7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Number,total=0;
        do {
            System.out.println("Please enter a Number");
            Number = input.nextInt();
            total = total + Number;

        }while (Number!=0);
        System.out.println("Sum Of Number Is "+total);



    }
}