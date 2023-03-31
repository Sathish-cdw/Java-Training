package task7;

import java.io.File;
import java.nio.file.NoSuchFileException;

public class DeleteRenameDisplaySize {
	public static void main(String[] args) {
		File fileDelete = new File("sample.txt");
		File fileRename = new File("sample2.txt");
		File rename = new File("ChangedName.txt");
		File fileLength= new File("length.txt");
		if(fileDelete.exists()){
			try{
				//deleting file if exist
				if(fileDelete.delete()){
					System.out.println("file deleted");
				}
			}
			catch(Exception e){
				System.out.println("no directory is no correct");
			}
		}
		else{
			//if file no exist
			System.out.println("no file present");
		}
		//renaming the file 
		if(fileRename.renameTo(rename)){
			System.out.println("file name changed sucessfully");
		}
		//printing lenght of file
		System.out.println("The length of file is "+fileLength.length());
}
}
