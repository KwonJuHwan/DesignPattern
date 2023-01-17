import java.io.IOException;
import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;


public abstract class ImageConverter {
	public void converter(String filename, String pre, String png) {
		try {
			BufferedImage image = ImageIO.read(new File(filename));
			  for(int y = 0; y < image.getHeight(); y++) {
	               for(int x = 0; x < image.getWidth(); x++) {
	                   // (x, y)�� �ش�Ǵ� �ȼ��� RGB ������ �޾Ƽ� Color�� ����
	                   Color color = new Color(image.getRGB(x, y));
	                   // RGB ���� ���� �о �÷� ��ȯ(���⼭�� ������� ��ȯ)
	                   Color newColor = convertColor(color);
	                   // ���� ������� RGB ���� (x, y)��ǥ �ȼ� �÷��� ����
	                   image.setRGB(x, y, newColor.getRGB());
	               }
	            }
			  ImageIO.write(image, png , new File(pre + filename));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
	}
	public abstract Color convertColor(Color color);
}
