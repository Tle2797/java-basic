public class DecoceAndEncode {
    public static void main(String[] args) {
        try {
            String str = "Hello Java";
            byte[] encoded = str.getBytes("UTF-8");
            String decoded = new String(encoded, "UTF-8");
            
            System.out.println("Encoded: " + encoded);
            System.out.println("Decoded: " + decoded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
