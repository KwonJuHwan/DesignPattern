
public class main {

	public static void main(String[] args) {
		 final String HOUSE = "house.png"; // ���� ���� ���� �̸�
		 final String[] pre= {"g_", "s_", "i_"};
		 final String png= "png";
		 ImageConverter[] image= {new GreyImageConverter(),new SepiaImageConverter(),new InverseImageConverter()};
		 for(int i=0; i<3; i++) {
			 image[i].converter(HOUSE, pre[i], png);
		 }
	}

}
