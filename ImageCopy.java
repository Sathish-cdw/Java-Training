package task7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
	public static void main(String[] args) throws IOException {
		//reading file from location
        	FileInputStream readFile=new FileInputStream("/Users/sathish_s/Documents/images.jpeg");
		//copying the image to other location
       		FileOutputStream writeFile=new FileOutputStream("copiedImage.jpeg");
		try{
		int i;
		while((i=readFile.read())!=-1) {
			//writing the file to destination file
			writeFile.write(i);
		}
			System.out.println("write sucessfully");
		}
		catch(Exception e){
        		e.printStackTrace();
        	}
		finally{
			//finally closing all the files
			readFile.close();
			writeFile.close();
		}
	}
}
