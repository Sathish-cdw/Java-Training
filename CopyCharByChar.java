package task7;


import java.io.FileReader;
import java.io.FileWriter;
public class CopyCharByChar {
	public static void main(String[] args) throws Exception{
		FileReader readFile=new FileReader("data.txt");
		try (FileWriter writeFile=new FileWriter("copy.txt")){
		char character[]=new char[8];
		int i=0;
		while((i=readFile.read(c))!=-1) {
			String string=new String(c,0,i);
			WriteFile.write(string);
		}
			System.out.println("writed sucessfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
