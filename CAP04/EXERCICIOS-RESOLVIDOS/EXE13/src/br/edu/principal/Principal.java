package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double op, sal, imp, aum, novo_sal;
		sal = 1416.17;
		imp = 0;
		aum = 0;
		
		System.out.println("menu de opções");
		System.out.println("1 - imposto");
		System.out.println("2 - novo salário");
		System.out.println("3 - classificação");
		System.out.print("Digite a opção desejada: ");
		op = sc.nextInt();
		
		if (op==1) {
			if (sal<500) {
				imp = sal * 5/100;
			}
			else if (sal>=500 & sal<=850) {
				imp = sal * 10/100;
			}
			else if (sal>850) {
				imp = sal * 15/100;
			}
			System.out.print("\nimposto: "+imp);
		}
		else if (op==2) {
			if (sal>1500) {
				aum = 25;
			}
			else if (sal>=750 & sal<=1500) {
				aum = 50;
			}
			else if (sal<450) {
				aum = 100;
			}
			novo_sal = sal + aum;
			System.out.print("\nsalário: "+novo_sal);
		}
		else if (op==2) {
			if (sal<=750) {
				System.out.println("Mal remunerado");
			}
			else if (sal>700) {
				System.out.println("bem remunerado");
			}
		}
		if (op < 1 | op > 3) {
			System.out.println("Opção ínvalida");
		}


	}

}
