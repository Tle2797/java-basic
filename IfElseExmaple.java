public class IfElseExmaple {
    public static void main(String[] args) {
        int number = 10;
        if(number > 0) {
            System.out.println("Positive Number");
        }else{
            System.out.println("Zero or negative number");
        }

        int score = 40;

        if(score  >= 80) {
            System.out.println("Grade A");
        }else if(score >= 70) {
            System.out.println("Grade B");
        }else if(score >= 60) {
            System.out.println("Grade C");
        }else if(score >= 50) {
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }

        int age = 20;
        boolean hasID = true;

        if(age >= 18 && hasID) {
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied");
        }

        String dayOfWeek = "Saturday";

        if(dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            System.out.println("Weekend");
        }else{
            System.out.println("Weekday");
        }

    }
}
