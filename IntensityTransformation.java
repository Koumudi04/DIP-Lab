package DIPLab;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;


public class IntensityTransformation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\grey.jpg");
		BufferedImage img = ImageIO.read(f1);
		//Negative
		BufferedImage nimg = ImageIO.read(f1);
		for(int i = 0; i <img.getHeight(); i++) {
			for(int j = 0; j < img.getWidth(); j++) {
				int p = img.getRGB(j, i);
				p = 255 - p;
				int a = 0xff & p >> 24;
				int r = 0xff & p >> 16;
				int g = 0xff & p >> 8;
				int b = 0xff & p;
				p = p | b;
                p = p | (g << 8);
                p = p | (r << 16);
                p = p | (a << 24);
				nimg.setRGB(j, i, p);
			}
		}
		File f2 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\negative.jpg");
		ImageIO.write(nimg, "jpg", f2);
		
		//Log
		BufferedImage limg = ImageIO.read(f1);
		for(int i = 0; i <img.getHeight(); i++) {
			for(int j = 0; j < img.getWidth(); j++) {
				int p = img.getRGB(j, i);
				int a = 0xff & p >> 24;
				int r = 0xff & p >> 16;
				int g = 0xff & p >> 8;
				int b = 0xff & p;
				
				r = (int)Math.round(20 * Math.log10((double) r) + 1);
				g = (int)Math.round(20 * Math.log10((double) g) + 1);
				b = (int)Math.round(20 * Math.log10((double) b) + 1);
				
				p = p | b;
                p = p | (g << 8);
                p = p | (r << 16);
                p = p | (a << 24);
				limg.setRGB(j, i, p);
			}
		}
		File f3 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\log.jpg");
		ImageIO.write(limg, "jpg", f3);
		
		//Log
		BufferedImage pimg = ImageIO.read(f1);
		for(int i = 0; i <img.getHeight(); i++) {
			for(int j = 0; j < img.getWidth(); j++) {
				int p = img.getRGB(j, i);
				int a = 0xff & p >> 24;
				int r = 0xff & p >> 16;
				int g = 0xff & p >> 8;
				int b = 0xff & p;
				
				r = (int)Math.round(Math.pow((double) r, 1.0));
				g = (int)Math.round(Math.pow((double) g, 1.0));
				b = (int)Math.round(Math.pow((double) b, 1.0));
				
				p = p | b;
                p = p | (g << 8);
                p = p | (r << 16);
                p = p | (a << 24);
				pimg.setRGB(j, i, p);
			}
		}
		File f4 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\powerlaw1.jpg");
		ImageIO.write(limg, "jpg", f4);
		System.out.println("Done!");
	}

}
