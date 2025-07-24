import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // initialising the dynamic array
        ArrayList<String> arr= new ArrayList<>();// we can also mention capacity here
        arr.add("hello");
        arr.add("h");
        arr.add("jj");
        arr.remove(0);
        arr.set(1,"uuu");//use for updating an element
        // for printing
        System.out.println(arr.get(2));
        for(String i:arr){
            System.out.println(i);
        }
    }
}
