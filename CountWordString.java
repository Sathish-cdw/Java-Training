package task7;

import java.util.Scanner;

public class CountWordString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		a = a.strip();
		System.out.println(a.length());
		scanner.close();
	}
}
