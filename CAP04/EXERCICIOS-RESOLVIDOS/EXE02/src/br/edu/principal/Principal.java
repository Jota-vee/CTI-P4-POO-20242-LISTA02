package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double n1, n2, n3, media, exam;
		n1 = 7;
		n2 = 4;
		n3 = 9;
		media = (n1+n2+n3)/3;
		
		System.out.println("Média aritmética: "+media);
		if (media >= 0 & media<3) {
			System.out.println("Reprovado");
		}
		else if (media >= 3 & media <7) {
			System.out.println("Exame final");
			exam = 7;
			System.out.println("Média final: "+(media+exam)/2);
			if ((exam+media)/2 >= 6) {
				System.out.println("Aprovado");
			}
			else {
				System.out.println("Reprovado");
			}
		}
		else {
			System.out.println("Aprovado");
		}

	}

}
