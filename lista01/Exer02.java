package com.gabriel.unipejava.aula05.lista;

import java.util.Scanner;
public class Exer02 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor = 0;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("Informe o %dº valor: ", i + 1);
			valor = teclado.nextInt();
			
			if(valor % 2 == 0) {
				System.out.println("Par");
				
			} else {
				System.out.println("Ímpar");
			}
		}
		
		
	
	}

}
