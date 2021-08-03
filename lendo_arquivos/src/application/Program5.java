package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program5 {

	public static void main(String[] args) {

		String[] lines = new String[] { "good morning", "good afternoon", "Good night" };

		// Creating out2.txt file
		String path = "/home/douglas/learn/praticing-java/course-exercises/java-completo-programação-orientada-a-objetos+projetos/lendo_arquivos/src/resources/out2.txt";

		// when second param is "true" in FileWriter,
		// the content to be written will be added to the 
		// existing one in the file.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
