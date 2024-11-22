package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double i,a,b,c;
		a = 7;
		b = 4;
		c = 9;
		i = 3;
		if (i==1) {
			if (a<b & a<c) {
				if (b<c) {
					System.out.println("A ordem crescente dos números "+a+", "+b+", "+c);
				}
				else {
					System.out.println("A ordem crescente dos números "+a+", "+c+", "+b);
				}
			}
			else if (b<a & b<c) {
				if (a<c) {
					System.out.println("A ordem crescente dos números "+b+", "+a+", "+c);
				}
				else {
					System.out.println("A ordem crescente dos números "+b+", "+c+", "+a);
				}
			}
			else if (c<a & c<b) {
				if (a<b) {
					System.out.println("A ordem crescente dos números "+c+", "+a+", "+b);
				}
				else {
					System.out.println("A ordem crescente dos números "+c+", "+b+", "+a);
				}
			}
			
		}
		else if (i==2) {
			if (a>b & a>c) {
				if (b>c) {
					System.out.println("A ordem crescente dos números "+a+", "+b+", "+c);
				}
				else {
					System.out.println("A ordem crescente dos números "+a+", "+c+", "+b);
				}
			}
			else if (b>a & b>c) {
				if (a>c) {
					System.out.println("A ordem crescente dos números "+b+", "+a+", "+c);
				}
				else {
					System.out.println("A ordem crescente dos números "+b+", "+c+", "+a);
				}
			}
			else if (c>a & c>b) {
				if (a>b) {
					System.out.println("A ordem crescente dos números "+c+", "+a+", "+b);
				}
				else {
					System.out.println("A ordem crescente dos números "+c+", "+b+", "+a);
				}
			}
			
		}
		else if (i==3) {
			if (a>b & a>c) {
				System.out.println("A ordem desejada é: "+b+", "+a+", "+c);
			}
			else if (b>a & b>c) {
				System.out.println("A ordem desejada é: "+a+", "+b+", "+c);
			}
			else if (c>a & c>b) {
				System.out.println("A ordem desejada é: "+a+", "+c+", "+b);
			}
		}
	

	}

}
