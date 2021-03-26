package br.com.erickfreire.produto;

import java.util.Scanner;

/**
 * Crie um programa que calcule o produto de três valores
 * @author Erick Freire
 * @version 1 Criado em 25-03-2021 as 23:40  
 */

public class Produto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int produto;
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		numero3 = entrada.nextInt();
		
		produto = numero1 * numero2 * numero3;
		
		System.out.printf("Produto: %d%n", produto);
	}

}
