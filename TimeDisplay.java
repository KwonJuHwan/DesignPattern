package HIghHomework5;
import javax.swing.*;
import java.awt.*;

public class TimeDisplay extends BaseDisplayDecorator {
    public TimeDisplay(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    public String getText() {
        java.time.LocalDateTime t = java.time.LocalDateTime.now();
        return "Date: " + t.toString();
    }
}
