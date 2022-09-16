package DIPLab;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ConvertColor {
	public static void main(String[] args) throws IOException{
		File f1 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\00.jpg");
	    BufferedImage img = ImageIO.read(f1);
	    int height = img.getHeight();
	    int width = img.getWidth();
        for(int i=0;i<height;i++){
	        for(int j=0;j<width;j++){
	            Color c=new Color(img.getRGB(j, i));
		        int red = c.getRed();
		        int green = c.getGreen();
		        int blue = c.getBlue();
		       
//		        System.out.println("S.No: " + count+ "Red "+ c.getRed() + "Green" + c.getGreen() + "Blue " + c.getBlue() );
		       
		        red = (int)(.288*red);
		        green = (int)(.3*green);
		        blue = (int)(.114*blue);
//		        int bw = red+green+blue;
		       
		        Color nc = new Color(red,green,blue);
		        img.setRGB(j,i,nc.getRGB());
	        }
        }
	           
		File f2 = new File("D:\\Study\\VI Sem\\Lab\\DIPLAB\\cc1.jpg");
		ImageIO.write(img, "jpg", f2);
		System.out.println("Successfull");
	}
}
