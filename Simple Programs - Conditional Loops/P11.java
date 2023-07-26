// Take integer inputs till the user enters 0 and print the largest number from all

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers, with 0 to end");
        List<Integer> list = new ArrayList<>();
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        Collections.sort(list); // Sort the list in ascending order
        int maximum = Collections.max(list); // Find the maximum element

        System.out.println("Maximum element: " + maximum);
    }
}
