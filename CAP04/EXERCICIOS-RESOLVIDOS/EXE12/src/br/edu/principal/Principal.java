package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, aumento, novo_sal;
		int cargo;
		
		System.out.println("Digite o cargo do funcionario de 1 á 5");
		cargo = sc.nextInt();
		System.out.print("salario: ");
		salario = sc.nextDouble();
		
		if (cargo==1) {
			System.out.println("o cargo é escriturário");
			aumento = salario *50/100; 
			System.out.println("o valor de aumento é "+aumento+" R$");
			novo_sal = salario + aumento;
			System.out.println("o novo salário é: "+novo_sal+" R$");
		}
		else {
			if (cargo==2) {
				System.out.println("o cargo é secretário");
				aumento = salario *35/100; 
				System.out.println("o valor de aumento é "+aumento+" R$");
				novo_sal = salario + aumento;
				System.out.println("o novo salário é: "+novo_sal+" R$");
			}
			else {
				if (cargo==3) {
					System.out.println("o cargo é caixa");
					aumento = salario *20/100; 
					System.out.println("o valor de aumento é "+aumento+" R$");
					novo_sal = salario + aumento;
					System.out.println("o novo salário é: "+novo_sal+" R$");
				}
				else {
					if (cargo==4) {
						System.out.println("o cargo é gerente");
						aumento = salario *10/100; 
						System.out.println("o valor de aumento é "+aumento+" R$");
						novo_sal = salario + aumento;
						System.out.println("o novo salário é: "+novo_sal+" R$");
					}
					else {
						if (cargo==5) {
							System.out.println("o cargo é diretor");
							aumento = salario *0/100; 
							System.out.println("o valor de aumento é "+aumento+" R$");
							novo_sal = salario + aumento;
							System.out.println("o novo salário é: "+novo_sal+" R$");
						}
						else {
							System.out.println("cargo inexistente");
						}
					}
				}
			}
			
		}
	}

}
