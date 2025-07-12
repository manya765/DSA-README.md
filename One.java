import java.util.Arrays;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // defining the array 
        int[] arr1;  // this is just the reference variable -> in stack memory
        arr1 = new int[8];  // this is the object of the array which is stored in heap memory the data will be integer only and it is not continous due to JLS
        // for input 
        arr1[0]=1; // this is the manual method when only a small number of entries are there 
        for(int i=0;i<arr1.length;i++){ // loop is used when we have to input a lot of values 
            arr1[i]= sc.nextInt();
        }
        // printing an array if the array is empty then it will return null it only happens in objects 
        System.out.println(arr1[0]); // printing a single element
        System.out.println(Arrays.toString(arr1)); // converting the array into string and then displaying it
        // Loop method
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        } 
        for(int num:arr1){
            System.out.println(num);
        }
        
    }
}
// Note: since we can change the objects therefore they are mutable and Strings are immutable