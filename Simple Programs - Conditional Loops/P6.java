
import java.util.Scanner;

public class P6 {
    public P6() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Number");
        int Num = sc.nextInt();

        int sum;
        for(sum = 0; Num > 0; Num /= 10) {
            int temp = Num % 10;
            sum += temp;
        }

        System.out.println(sum);
        sc.close();
        
    }
    

}