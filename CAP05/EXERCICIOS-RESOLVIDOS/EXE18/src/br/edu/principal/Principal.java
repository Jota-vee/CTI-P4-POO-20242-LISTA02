package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double num, quad, cubo, raiz;
    	
    	System.out.print("num: ");
    	num = sc.nextDouble();
    	 while (num>0) {
    		 
    		 quad = num*num;
    		 cubo = num*num*num;
    		 raiz = Math.pow(num, 0.5);
    		 
    		 System.out.println("quadrado: "+quad);
    		 System.out.println("cubo: "+cubo);
    		 System.out.println("raiz: "+raiz);
    		 
    		 System.out.print("\nnum: ");
    	     num = sc.nextDouble();		 
    	 }
    	
    }
    
}