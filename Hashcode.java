public class Hashcode {
    public static void main(String[] args) {
        // How hashcode is internally formed using .hashcode() method
        String name="Hello";
        Integer b=12345;  // methods can only be used for objects and wrapper  
        int c= b.hashCode();
        int a=name.hashCode();
        System.out.println(a);
    }
}
