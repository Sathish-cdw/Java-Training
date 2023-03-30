package task7;

import java.util.Scanner;

public class StdIn {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int characterCount = 0;
            System.out.println("Enter words or Press Ctrl+D to exit: ");
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split(" ");
                for(int i=0;i<words.length;i++)
                    characterCount += words[i].length();
            }
            System.out.println("Number of words: "+characterCount);
        }
    }
}