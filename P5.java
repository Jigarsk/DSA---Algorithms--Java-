

//Fibonacci Series

import java.util.Scanner;

public class P5 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Number");
        int Num = input.nextInt();
        int F = 1;
        int S = 1;

        for(int i = 2; i < Num; ++i) {
            int T = F + S;
            F = S;
            S = T;
            System.out.println(T);
        }

    }
}