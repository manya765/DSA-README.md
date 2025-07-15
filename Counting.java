import java.util.Scanner;

public class Counting {
    public static void main(Str[] args) {
        int n = 12349485;
        int count=0;
        while(n!=0){
          int i=n%10;
          if (i==7) {
            count++;
          }
          n = n/10;
        }
        System.out.println(count);
    }
}
