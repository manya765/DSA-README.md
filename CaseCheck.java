import java.util.Scanner;

public class CaseCheck {
    public static void main(Str[] args) {
        // for input
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println("The Letter is Uppercase");
        }
        else{
            System.out.println("The Letter is Lowercase");
        }
    }
}
