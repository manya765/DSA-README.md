import java.util.ArrayList;

public class Concatenate {
    public static void main(String[] args) {
        // NOTE : the result will be printed together only if atleast one of the them is primitive or a string we cant print two ojects togther alone 
        // this type of concatenation happen only in strings in java but we can concatenate 2 objects together in C++ and PYTHON
        System.out.println('a'+'b');  // this will print the ascii value of both
        System.out.println("a"+"b");//here both are strings
        System.out.println("a"+1); // the printstream will convrt the 1 into Integr(wrpper class)and then into tostring and then print it
        System.out.println('a'+1);
        System.out.println("rahul"+ new ArrayList<>());
        System.out.println("rahul"+ new Integer(3));
      //    System.out.println(new Arraylist()+new Integer(0)); this is not possible
        System.out.println(new ArrayList<>()+""+new Integer(0)); // this is possible
    }
}
