package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num1, num2;
		num1 = 7;
		num2 = 7;
		
		if (num1>num2) {
			System.out.println("O número "+num1+" é maior que "+num2);
		}
		else if (num2>num1) {
			System.out.println("O número "+num2+" é maior que "+num1);
		}
		else {
			System.out.println("Os números "+num1+", "+num2+" são iguais");
		}

	}

}
