import java.nio.charset.StandardCharsets;

public class Encode {
    public static void main(String[] args) {
        // encoding a string in java 
        // function Base64
        // UTF-8 Encoding valid for characters as well as special characters like !~&*...etc
        String s="Hello:";
        
        //Encode method in UTF8
        byte[] enc=s.getBytes(StandardCharsets.UTF_8);
        System.out.println("UTF-8 Bytes"+java.util.Arrays.toString(enc));

        // Decode
        String decoded= new String(enc,StandardCharsets.UTF_8);
        System.out.println("Decoded String "+decoded);
    }
}
