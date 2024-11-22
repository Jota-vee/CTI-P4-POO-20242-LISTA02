package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num1, num2, num3, num4;
		num1 = 1;
		num2 = 3;
		num3 = 5;
		num4 = 4;
		
		if (num4 > num3) {
			System.out.println("A ordem decrescente é "+num4+", "+num3+", "+num2+", "+num1);
		}
		else if (num4 > num2 & num4 < num3) {
			System.out.println("A ordem decrescente é "+num3+", "+num4+", "+num2+", "+num1);
		}
		else if (num4 > num1 & num4 < num2) {
			System.out.println("A ordem decrescente é "+num3+", "+num2+", "+num4+", "+num1);
		}
		else if (num4 < num1) {
			System.out.println("A ordem decrescente é "+num3+", "+num2+", "+num1+", "+num4);
		}
		
	

	}

}
