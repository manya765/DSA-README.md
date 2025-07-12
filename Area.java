public class Area {
    public static void main(String[] args) {
        Circle(8);
    }
    public static void Circle(int r){
        Double Circumference =  (2*r*Math.PI);
        Double Area= Math.PI*r*r;
        System.out.println("The circumferece is"+ Circumference);
        System.out.println("The area is "+ Area);
    }
}
