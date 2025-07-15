import java.util.Scanner;

public class Switch {
    public static void main(Str[] args) {
        Scanner sc= new Scanner(System.in);
        Str n = sc.next();
        Str m = sc.next();
      /*   switch(n){
        case "Apple":
        {
            System.out.println("hello");
        }
        case"Mango":
        {
            System.out.println("jjjj");
        }*/
      // nested switch
       switch(n){
        case"Apple" ->{ switch(m){
        case"hello"->System.out.println("hello");}}
        case"Mango" -> System.out.println("jjjj");
      }
    }
}
