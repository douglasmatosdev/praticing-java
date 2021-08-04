package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		File file = new File("/home/douglas/learn/praticing-java/exception/src/resource/in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			
			System.out.println("Block Finlay has be executed");
		}
	}
}