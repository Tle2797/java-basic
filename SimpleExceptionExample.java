public class SimpleExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("output: " + result);
        } catch (Exception e) {
           System.out.println("Error" + e.getMessage());
        }

        int[] numbers = {1, 3, 5};
        try {
            System.out.println(numbers[5]);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
