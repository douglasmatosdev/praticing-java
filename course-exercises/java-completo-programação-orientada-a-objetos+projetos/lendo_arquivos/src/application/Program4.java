package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program4 {

	public static void main(String[] args) {

		String[] lines = new String[] { "good morning", "good afternoon", "Good night" };

		// Creating out.txt file
		String path = "/home/douglas/learn/praticing-java/course-exercises/java-completo-programação-orientada-a-objetos+projetos/lendo_arquivos/src/resources/out.txt";

		// if exists file, it will be destroyed and recreated later
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
