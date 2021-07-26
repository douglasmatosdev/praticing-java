package application;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "/home/douglas/learn/praticing-java/course-exercises/java-completo-programação-orientada-a-objetos+projetos/lendo_arquivos/src/resources/in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
 
	}

}
