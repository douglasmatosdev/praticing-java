package application;

import java.util.Locale;
import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		
		// Resolve separation in double values "," or "."
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int x1;
		double x2;
		double x3;
		char x4;
		String nome;
		int idade;
		double altura;
		
		System.out.println("Digite uma String: ");
		x = sc.next();
		System.out.println("Digite um número inteiro: ");
		x1 = sc.nextInt();
		System.out.println("Digite um número double: ");
		x2 = sc.nextDouble();
		System.out.println("Digite um número double com várias casas decimais: ");
		x3 = sc.nextDouble();
		System.out.println("Digite uma letra ou uma palavra: ");
		x4 = sc.next().charAt(0);
		System.out.println("Digite na mesma linha!!!");
		System.out.println("Seu nome, idade e altura.");
		System.out.println("Separados por espaço.");
		nome = sc.next();
		idade = sc.nextInt();
		altura = sc.nextDouble();
		
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + x1);
		System.out.println("Você digitou: " + x2);
		System.out.print("Você digitou: " + x3 + ", e formatamos para ");
		System.out.printf("%.2f%n", x3, ", com 2 casas decimais");
		System.out.println("A primeira letra que você digitou foi \"" + x4 + "\"");
		System.out.println();
		System.out.println("Os dados de nome, idade e altura digitados foram: ");
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		
		
		sc.close();

	}

}
