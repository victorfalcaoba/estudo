package br.com.victor.estudo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x, y;



		System.out.println("Digite o primeiro valor a ser somado.");
		x = entrada.nextInt();

		System.out.println("Digite o segundo valor a ser somado.");
		y = entrada.nextInt();

		System.out.println("O resultado é : " + (x + y));
	
	}

}
// fazer uma calculadora que receba 2 int, some e apresente na tela. 