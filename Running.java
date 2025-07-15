import java.util.Arrays;

public class Running {
     public static int[] runningSum(int[] nums){
        int[] sum = new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<sum.length;i++){
           sum[i]= sum[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(sum));
        return sum;
        
        
    }
     public static void main(Str[] args) {
        int[] num={1,2,3,4};
        runningSum(num);
     }
}
