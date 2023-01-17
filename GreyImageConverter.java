import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

//import java.imageio.*;

// ��� �������� ��ȯ�ϴ� �ڵ�
class GreyImageConverter extends ImageConverter{
	@Override
	public Color convertColor(Color color) {
		 int outputRed = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
		Color newColor = new Color(outputRed,outputRed,outputRed);
		return newColor;
	}
	
    
}