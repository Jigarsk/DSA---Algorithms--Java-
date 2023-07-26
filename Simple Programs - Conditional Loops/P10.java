import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a nber ");
        int n = sc.nextInt();
        int sum = 0, prod = 1;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            prod = prod * rem;
            n = n / 10;

        }
        int Result = prod - sum;
        System.out.println(Result);

    }

}

//LEETCODE CODE BELOW :

//  class Solution {
// public int subtractProductAndSum(int n){
           
//         int sum=0,prod=1;
//     while(n!=0){
//         int rem =  n%10;
//         sum = sum+rem;
//         prod = prod*rem;
//         n = n/10;

//     }
// return prod-sum;        


       
//     }
// }