package task7;
import java.io.*;
import java.util.Date;
public class DateObject {
	public static void main(String[] args) throws Exception {
		Date date=new Date();
		try(ObjectOutputStream outputStream =new ObjectOutputStream(new FileOutputStream("dateStore.txt"))){
			outputStream.writeObject(date);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try(ObjectInputStream inputStream =new ObjectInputStream(new FileInputStream("dateStore.txt"))){
			Date date=(Date) inputStream.readObject();
			System.out.println(date);
			inputStream.close();
		}
		catch(Exception e) {
				e.printStackTrace();				
		}
	}
}
