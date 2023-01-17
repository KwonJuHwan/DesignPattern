import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

//import java.imageio.*;

class InverseImageConverter extends ImageConverter {
	
	@Override
	public Color convertColor(Color color) {
		 int outputRed = 255 - color.getRed();
	     int outputGreen = 255 - color.getGreen();
	     int outputBlue = 255 - color.getBlue();
	     Color newColor = new Color(outputRed, outputGreen, outputBlue);
		return newColor;
	}
}