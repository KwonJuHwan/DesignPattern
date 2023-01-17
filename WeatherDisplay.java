package HIghHomework5;
import javax.swing.*;
import java.awt.*;

public class WeatherDisplay extends BaseDisplayDecorator {
    public WeatherDisplay(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    public String getText() {
        return "Weather: �삩�룄: 20�룄, �뒿�룄: 60";
    }
}
