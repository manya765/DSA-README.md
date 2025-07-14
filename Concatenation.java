import java.util.Arrays;

public class Concatenation {
      public static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int a = 2*n;
        int[] ans = new int[a];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
      
      }
      public static void main(String[] args) {
        int[] nums={1,2,3};
        getConcatenation(nums);
       
      }
}
