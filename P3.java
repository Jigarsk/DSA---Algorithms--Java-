import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        System.out.println("Please Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello ! Nice To Have You " + name);
        sc.close();
    }
}