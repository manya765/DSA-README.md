import java.util.Arrays;
import java.util.Scanner;

public class Twodarray {
    public static void main(Str[] args) {
        Scanner sc = new Scanner(System.in);
        // initialising the 2d array
        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

         for(int i=0;i<arr.length;i++){
             for(int j =0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
             }
             System.out.println( " ");

         }
         // improved version of array
         for(int[] a:arr){
            System.out.println(Arrays.toString(a));
         }
    }
}
