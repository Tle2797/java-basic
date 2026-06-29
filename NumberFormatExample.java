
import java.text.NumberFormat;

public class NumberFormatExample {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        System.out.println(numberFormat.format(1234567890));

        NumberFormat numberFormat2 = NumberFormat.getInstance();
        numberFormat2.setMinimumFractionDigits(2);
        System.out.println(numberFormat2.format(1234567890));
    }
}
