public class Swap {
    public static void main(Str[] args) {
        int a = 10;
        int b=20;
        swap(a,b);
        System.out.println("The value of a and b is"+ a + b);
    }
    static  void swap(int num1,int num2){
        int Temp=num1;
        num1=num2;
        num2=Temp;
    }
}
