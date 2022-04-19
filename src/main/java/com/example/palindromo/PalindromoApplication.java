package com.example.palindromo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PalindromoApplication {

	public static void main(String[] args) {

		SpringApplication.run(PalindromoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.println("VERIFICAÇÃO DE PALINDROMAS");
		System.out.println("Insira a string para a verificação: ");

		String entrada = scanner.nextLine();
		String palavra = entrada.replaceAll(" ","").replaceAll("\\p{Punct}", "")
				.toLowerCase()
				.replaceAll("á|à|â|ã|ä", "a")
				.replaceAll("é|è|ê|ë", "e").replaceAll("ì|í|î|ï", "i")
				.replaceAll("ò|ó|ô|õ|ö", "o").replaceAll("ù|ú|û|ü", "u");

		int j = palavra.length() - 1;

		//System.out.println(palavra);

		for(int i=0; i<j;i++, j--){
			if (palavra.charAt(i)!=palavra.charAt(j)){
				System.out.println("Não é palíndroma");
				System.exit(0);
			}
		}
		System.out.println("É palindroma");
	}
}
