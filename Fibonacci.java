import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // to input the limit
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int Sum = 0;
        while (Sum<=n) {
             Sum= a+b;
            System.out.println(Sum);
            b= Sum;
            a=b;
           
        }
    }
}
