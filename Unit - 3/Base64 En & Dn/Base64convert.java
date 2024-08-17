import java.util.Base64;
public class Base64convert{
    public static void main(String[] args) {
        String str = "Example of Base 64 Conversion";
        byte[] b = str.getBytes();
        String base64 = Base64.getEncoder().encodeToString(b);
        System.out.println(base64);
        byte[] decoderBytes = Base64.getDecoder().decode(base64);
        String s = new String(decoderBytes);
        System.out.println(s);
    }
}