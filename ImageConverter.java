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
	                   // (x, y)에 해당되는 픽셀의 RGB 정보를 받아서 Color에 저장
	                   Color color = new Color(image.getRGB(x, y));
	                   // RGB 값을 각각 읽어서 컬러 변환(여기서는 흑백으로 변환)
	                   Color newColor = convertColor(color);
	                   // 새로 만들어진 RGB 값을 (x, y)좌표 픽셀 컬러로 저장
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
