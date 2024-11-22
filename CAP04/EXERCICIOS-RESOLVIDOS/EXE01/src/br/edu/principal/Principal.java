package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double trab, aval, exam, media;
		trab = 7.9;
		aval = 2.3;
		exam = 8.5;
		
		media = (trab*2 + aval*3 + exam*5)/10;
		System.out.println("Média ponderada "+media);
		
		if (media>=8 & media<=10) {
			System.out.println("Obeteve conceito A");
		}
		else if (media>=7 & media<8) {
			System.out.println("Obeteve conceito B");
		}
		else if (media>=6 & media<7) {
			System.out.println("Obeteve conceito C");
		}
		else if (media>=5 & media<6) {
			System.out.println("Obeteve conceito D");
		}
		else {
			System.out.println("Obeteve conceito E");
		}
	}
}
