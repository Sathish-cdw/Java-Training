package task7;

import java.io.File;
import java.nio.file.NoSuchFileException;

public class DeleteRenameDisplaySize {
	public static void main(String[] args) {
		File file1 = new File("sample.txt");
		File file2 = new File("sample2.txt");
		File rename = new File("ChangedName.txt");
		File file3 = new File("length.txt");
		if(file1.exists())
		{
			try
			{
				if(file1
						.delete())
				{
					System.out.println("file deleted");
				}
			}
			catch(Exception e)
			{
				System.out.println("no directory is no correct");
			}
		}
		else
		{
			System.out.println("no file present");
		}
	
	
		if(file2.renameTo(rename))
		{
			System.out.println("file name changed sucessfully");
		}
	
		System.out.println("the length of file is "+file3.length());
}
}
