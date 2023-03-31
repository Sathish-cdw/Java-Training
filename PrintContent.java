package task7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class PrintContent {
	public static void main(String[] args) {
		File fileRead = new File("Read.txt");
			//if file exist
			if (fileRead.exists()) {
				try (BufferedReader br = new BufferedReader(new FileReader("Read.txt"))) {
		   			String line = null;
		  			while ((line = br.readLine()) != null) {
		       				System.out.println(line);
		   			}
				}
				catch (IOException e) {
        				e.printStackTrace();
    				}
			}
			else {
    				System.out.println("file doesn't exist");
			}
	}
}
