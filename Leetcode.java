import java.util.Arrays;
import java.util.Scanner;

public class Leetcode {
    public static void main(Str[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        for(int i =0; i<num.length; i++){
             a = sc.nextInt( );
        if(a>=0 && a < num.length && !contains(num,a,i)){
           num[i]= a;
        }
        else{
            System.out.println("Kindly input the number less than arr.length-1");
            i--;
        }
    }
    int[] ans = new int[num.length];
     for(int i =0;i<ans.length;i++){
        ans[i]=num [num[i]];
     } 
     
        System.out.println(Arrays.toString(ans));
     
    }

    private static boolean contains(int[] num, int a, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }
}
