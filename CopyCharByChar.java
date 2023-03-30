package task7;


import java.io.FileReader;
import java.io.FileWriter;
public class CopyCharByChar {
	public static void main(String[] args) throws Exception{
		
		
		FileReader in=new FileReader("data.txt");
		
		try (FileWriter out=new FileWriter("copy.txt")){
		char c[]=new char[8];
		int i=0;
		while((i=in.read(c))!=-1) {
			String s=new String(c,0,i);
			out.write(s);
			
		}
		System.out.println("writed sucessfully");
		}
		catch(Exception e) {
			
		}
	}
}