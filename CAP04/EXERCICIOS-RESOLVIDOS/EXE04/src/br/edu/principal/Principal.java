package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double num1, num2, num3;
		num1 = 9;
		num2 = 6;
		num3 = 7;
		
		
		if (num1<num2 & num1<num3) {
			if (num2<num3) {
				System.out.println(num1+", "+num2+", "+num3);
			}
			else {
				System.out.println(num1+", "+num3+", "+num2);
			}
		}
		else if (num2<num1 & num2<num3) {
			if (num1<num3) {
				System.out.println(num2+", "+num1+", "+num3);
			}
			else {
				System.out.println(num2+", "+num3+", "+num1);
			}
		}
		else if (num3<num1 & num3<num2) {
			if (num1<num2) {
				System.out.println(num3+", "+num1+", "+num2);
			}
			else {
				System.out.println(num3+", "+num2+", "+num1);
			}
		}
	

	}

}
