package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, soma, raiz, op;
		System.out.println("Menu");
		System.out.println("1 - somar dois números");
		System.out.println("2 - raiz quadrada de um número");
		System.out.print("Digite sua opção:  ");
		op = sc.nextInt();
		
		if (op==1) {
			System.out.print("Primeiro número:  ");
			num1 = sc.nextDouble();
			System.out.print("segundo número:  ");
			num2 = sc.nextDouble();
			System.out.println();
			soma = num1+num2;
			System.out.println("A soma de "+num1+" e "+num2+" é "+ soma);
		}
		else if (op ==2) {
			System.out.print("Digite um valor:  ");
			num1 = sc.nextDouble();
			raiz = Math.pow(num1, 0.5);
			System.out.println("A raiz quadrada de "+num1+" é igual a "+raiz);
		}
		else {
			System.out.println("Opção ínvalida");
		}
	

	}

}
