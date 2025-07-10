import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Vote(20);
    }
    public static void Vote(int age){
        if(age>=18){
          System.out.println("Eligile to vote");
        }
        else{
          System.out.println("Not Eligible to vote");
        }
    }
}
