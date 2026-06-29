public class ThreadAndSleep {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        thread1.start();

        try {
            String output = "";

            for (int i = 1; i <= 100; i++) {
                output += ".";
                System.out.print("\r" + i + "%" + output);
                Thread.sleep(200);
            }

            System.out.println();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
