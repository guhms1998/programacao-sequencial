package br.com.generation.ex;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
				
				int n1, n2, n3;
		
		System.out.println("Digite 3 numeros: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if(n1 <=  n2 && n2 <= n3) {
			System.out.println("A ordem crescente \n" + n1 +" "+ n2 +" "+ n3);
		}
		else if(n1 <= n3 && n3 <= n2) {			
		    System.out.println("A ordem crescente: \n" + n1 +" "+ n3 +" "+ n2);
		}
		
		else if(n2 <= n1 && n1 <= n3) {
			System.out.println("a ordem crescente: \n" + n2 +" "+ n1 +" "+ n3);			
		}
		
		else if(n2 <= n3 && n3 <= n1) {
			System.out.println("a ordem crescente : \n" + n2 +" "+ n3 +" "+ n1);
		}
		else if(n3 <= n1 && n1 <= n2) {
			System.out.println("a ordem crescente: \n" + n3 +" "+ n1 +" "+ n2);
		}
		else if(n3 <= n2 && n2 <= n1) {
			System.out.println("a ordem crescente: \n" + n3 +" "+ n2 +" "+ n1);
		}

	}

}
