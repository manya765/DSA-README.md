import java.util.*;
public class SlidingWindow {
    // try to reduce the complexity of subarray or substrings
    // for a fixed size array
    // find the sum of max sub array
    public static void main(String[] args){
    int[] arr={1,2,3,4,5};
    int n=2;
    int Sum=0;
    for(int i=0;i<2;i++){
        Sum+= arr[i];
    }
    int Max=Sum;
    for(int j=n;j<arr.length;j++){
      Sum +=arr[j]-arr[j-n];
      Max=Math.max(Max,Sum);
    }
    System.out.println("The max value is "+Max);
    // Variable size logic - The window size will increase if the desired element is needed and it will be excluded if the element is not needed
}}
