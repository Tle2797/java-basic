public class LoopAvgNumber {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int num : number) {
            sum += num;
        }

        double avg = sum / number.length;

        System.out.println("Average of number is: " + avg);
    }
}
