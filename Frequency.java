import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        HashMap <String,Integer> map=new HashMap<>();
        // storing values along with frequency
        String[] arr={"hello","hhi","hello","yess"};
        for( String i:arr){
            map.put(i,map.getOrDefault(i,0)+1);  // use to store the frequency
        }
        for(int i:map.values()){
            System.out.println(i);
        }
    }

}
