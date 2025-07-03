import java.util.*;
public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> Arr1 = new ArrayList<>(2);
        Arr1.add(2);
        System.out.println(Arr1.get(0));//printing done through get
        //this is not possile we can't remove th whole array we need to mention the index
        System.out.println(Arr1.get(0));
        System.out.println(Arr1.size());
        //reszing done in many ways
        Arr1.add(3);
        Arr1.add(7);
        Arr1.add(9);
        System.out.println(Arr1.size());
        
    }
}
