package DIPLab;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class ColortoGrey {
	public static void main(String[] args) throws IOException{
		File f1 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\00.jpg");
		BufferedImage img = ImageIO.read(f1);
		for(int i = 0; i < img.getHeight(); i++) {
			for(int j = 0; j < img.getWidth(); j++) {
				int p = img.getRGB(j, i);
				int r = 0xff & (p >> 24);
				int g = 0xff & (p >> 16);
				int b = 0xff & (p >> 8);
				int a = 0xff & p;
				int grey = (r+g+b) / 3;
				p = a << 24| grey << 16 | grey << 8 | grey;
				img.setRGB(j, i, p);
			}
		}
		File f2 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\grey.jpg");
		ImageIO.write(img, "jpg", f2);
		System.out.println("Done!");
	}
}
