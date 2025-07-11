public class Marksheet {
    public static void main(String[] args) {
        Marks(80);
        Marks(91);
    }
    public static void Marks(int marks){
            switch (marks / 10) {
            case 10, 9 -> System.out.println("AA");  // 91–100
            case 8 -> System.out.println("BB");      // 81–90
            case 7 -> System.out.println("CC");      // 71–80
            case 6 -> System.out.println("DD");      // 61–70
            default -> System.out.println("Fail or Invalid marks");
        
        }
    }
}
