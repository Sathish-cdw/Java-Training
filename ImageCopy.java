package task7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) throws IOException {
		
		System.out.println("hello");
		
        
       FileInputStream in=new FileInputStream("/Users/sathish_s/Documents/images.jpeg");
       FileOutputStream out=new FileOutputStream("copiedImage.jpeg");
		int i;
		while((i=in.read())!=-1) {
			out.write(i);
		}
		in.close();
		out.close();
	}
}
