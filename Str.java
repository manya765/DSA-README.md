import java.util.*;
public class Str {
    public static void main(String[] args) {
        // initialising a string
        String sr= "Hello";
        String ar="Hello"; //will be stores inside the same string pool pointing towars the same object
        System.out.println(sr==ar); // it will return true if ar and sr are pointing to the same oject
        // if we want to point at diffrent object but with same value then we use NEW for creating a new object
        String a=new String("yess");
        String b=new String("yess");
        System.out.println(a==b);
        System.out.println(a.equals(b));  // we use .equals method for comparing the two objects
        // String is immutable due to safety reasons but we point the reference variable to another object
        sr="heyy";
        System.out.println(sr);
        // how .tostring is used for printing in Printstream
        System.out.println(23); // internally the printstream contains a method which converts the integer into a string and prints it 
        // everything in the printstrram is convert into an array wherther it is a character ,int or any other variable in only array we use 
        // Arrays.toString here we are referring to a method in array not in strings
        // PRETTY PRINITNG use in cp to show nicely like
        
    }
}
