
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class I18N {
    public static void main(String[] args) {
        Date date = new Date();
        int dfLong = DateFormat.LONG;
        int dfMedium = DateFormat.MEDIUM;

        DateFormat dfJP = DateFormat.getDateTimeInstance(dfLong, dfMedium, Locale.JAPAN);
        DateFormat dfFR = DateFormat.getDateTimeInstance(dfLong, dfMedium, Locale.FRANCE);

        dfJP.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        dfFR.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));

        System.out.println("Date and time: " + dfJP.format(date) + "In Japan locale");
        System.out.println("Date and time: " + dfFR.format(date) + "In France locale");
    }
}
