public class Factorial {
    public static void main(String[] args) {
        Fact(5);
    }
    public static void Fact(int a ){
        int fact=1;
        while(a!=0){
           fact=a*fact;
           a--;
          
        }
        System.out.println("The value is"+ fact);
    }
}
