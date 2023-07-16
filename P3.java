import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        System.out.println("Please Enter Your Name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello ! Nice To Have You " + name);
    }
}