package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        double cod, num_h, sal_b, sal_l, media_m, media_f,
        cont_m, cont_f;
        String sexo;
        
        System.out.print("cod: ");
        cod = sc.nextDouble();
        cont_m = 0;
        cont_f = 0;
        media_m = 0;
        media_f = 0;
        sal_l = 0;
        
        while (cod != 99999) {
        	System.out.print("sexo: ");
        	sexo = sc.next();
        	System.out.print("num_h: ");
        	num_h = sc.nextDouble();
        	sal_b = num_h * 30;
        	if (sexo.equalsIgnoreCase("M")) {
        		sal_l = sal_b - (sal_b * 10/100);
        		media_m = media_m + sal_l;
        		cont_m += 1;
        	}
        	else if (sexo.equalsIgnoreCase("F")) {
        		sal_l = sal_b - (sal_b * 5/100);
        		media_f = media_f + sal_l;
        		cont_f += 1;
        	}
        	System.out.println("cod   -> "+cod);
        	System.out.println("sal_b -> "+sal_b);
        	System.out.println("sal_l -> "+sal_l);
        	
        	System.out.print("cod: ");
            cod = sc.nextDouble();
        }
        if (cont_m == 0) {
        	System.out.println("\nNenhum professor do sexo masculino");
        }
        else {
        	media_m /= cont_m;
        	System.out.println("\nmedia_m: "+media_m);
        }
        if (cont_m == 0) {
        	System.out.println("\nNenhum professor do sexo feminino");
        }
        else {
        	media_m /= cont_m;
        	System.out.println("\nmedia_f: "+media_f);
        }
        
        
    }
    
}