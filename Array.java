import java.util.*;
public class Array {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
      // int Max= Math.max(c,Math.max(a,b)); // function approach
       //System.out.println("The largest no. is "+ Max);
       // loop aproach
       int Max= a;
       if(Max<b){
        Max=b;
       }
       if (Max<c){
        Max=c;
       }
       System.out.println(Max);
    }
}
