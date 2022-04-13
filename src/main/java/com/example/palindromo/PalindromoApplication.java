package com.example.palindromo;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SystemPropertyUtils;

import java.util.*;

@SpringBootApplication
public class PalindromoApplication {

	public static void main(String[] args) {

		SpringApplication.run(PalindromoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.println("VERIFICAÇÃO DE PALINDROMAS");
		System.out.println("Insira a string para a verificação: ");

		String entrada = scanner.nextLine();
		String palavra = entrada.replace(" ","").replaceAll("\\p{Punct}", "").toLowerCase();
		int j = palavra.length() - 1;

		System.out.println(palavra);

		for(int i=0; i<j;i++, j--){
			if (palavra.charAt(i)==palavra.charAt(j)){

			}else{
				System.out.println("Não é palíndroma");
				System.exit(0);
			}
		}
		System.out.println("É palindroma");
	}
}
