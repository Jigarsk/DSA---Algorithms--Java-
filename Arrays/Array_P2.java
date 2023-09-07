import java.util.Arrays;
import java.util.Scanner;

public class Array_P2 {
    public static void main(String[] args) {
        String[][] arr = new String[2][2];
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.next(); // Store the input in the array
            }
        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
