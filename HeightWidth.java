package DIPLab;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class HeightWidth {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\00.jpg");
		BufferedImage img = ImageIO.read(f1);
		System.out.println("Height: " + img.getHeight());
		System.out.println("Width: " + img.getWidth());
		File f2 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\heightwidth.jpg");
		ImageIO.write(img, "jpg", f2);
	}

}
