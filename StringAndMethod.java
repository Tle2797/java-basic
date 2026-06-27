public class StringAndMethod {
    public static void main(String[] args) {
        String str = "Hello Java Basic";

        System.out.println(str.length());

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // เปลี่ยนคำ
        System.out.println(str.replace("Basic", "Advand"));
        System.out.println(str.substring(0, 5));
        System.out.println(str.charAt(15));

        System.out.println(str.indexOf("Basic"));
        System.out.println(str.contains("Java"));

        System.out.println(str.isEmpty());
        System.out.println(str.trim());
    }
}
