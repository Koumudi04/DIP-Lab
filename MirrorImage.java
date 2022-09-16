package DIPLab;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MirrorImage {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f1 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\00.jpg");
		BufferedImage img = ImageIO.read(f1);
		BufferedImage mximg = ImageIO.read(f1);
		//X-Axis
		int kx = img.getHeight() - 1;
		for(int i = 0; i <img.getHeight(); i++) {
			for(int j = 0; j < img.getWidth(); j++) {
				int c = img.getRGB(j, i);
				mximg.setRGB(j, kx, c);
			}
			kx--;
		}
		File f2 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\x-axis.jpg");
		ImageIO.write(mximg, "jpg", f2);
		
		//Y-Axis
		BufferedImage myimg = ImageIO.read(f1);
		for(int i = 0; i <img.getHeight(); i++) {
			int ky = img.getWidth() - 1;
			for(int j = 0; j < img.getWidth(); j++) {
				int c = img.getRGB(j, i);
				myimg.setRGB(ky, i, c);
				ky--;
			}
		}
		File f3 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\y-axis.jpg");
		ImageIO.write(myimg, "jpg", f3);
		
		//XY-Axis
		BufferedImage mxyimg = ImageIO.read(f2);
		for(int i = 0; i <img.getHeight(); i++) {
			int kxy = img.getWidth() - 1;
			for(int j = 0; j < img.getWidth(); j++) {
				int c = mximg.getRGB(j, i);
				mxyimg.setRGB(kxy, i, c);
				kxy--;
			}
		}
		File f4 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\xy-axis.jpg");
		ImageIO.write(mxyimg, "jpg", f4);
	}

}
