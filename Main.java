import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static Date[] createDateArray(String[] dateStrings) {
        SimpleDateFormat dateTimeInstance = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date[] dates = new Date[dateStrings.length];
        for (int i = 0; i < dateStrings.length; i++) {
            dates[i] = dateTimeInstance.parse(dateStrings[i], new ParsePosition(0));
        }
        return dates;
    }

    public static void main(String[] args) {
        Integer[] data = { 1, 3, 7, 5, 6, 4, 10, 8 };
        String[] data2 = { "hello", "hello1", "world1", "world", "new", "next" };
        String[] dateStrings = { "2022-09-13T21:59:00", "2022-09-12T21:59:00",
                "2022-09-13T16:54:00", "2022-09-12T21:54:00", "2022-09-13T11:59:00" };

        Date[] dates = Main.createDateArray(dateStrings);
        Sorter si = new Sorter();
        si.bubbleSortInts(data);
        Printer.print(data);
        si.bubbleSortStrings(data2);
        Printer.print(data2);
        si.bubbleSortDates(dates);
        Printer.print(dates);
    }
}
