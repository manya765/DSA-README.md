import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] Arr1={2,3,4,5,6};
        change(Arr1);
        System.out.println(Arrays.toString(Arr1));
    }

    static void change(int[] nums){
        nums[0]=99;
    }

}
