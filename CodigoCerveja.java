package com.gabriel.unipejava.aula04;

import java.util.Scanner;
public class CodigoCerveja {
	
	public static void main(String[] args) {
		
		int cervejas = 99;
		int opcao = 0;
		int quantidadeDeCerva = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		while(cervejas > 0) {
			System.out.println(cervejas + "cervejas no freezer. ");
			System.out.println("Pego uma garrafa e passo para frente");
			
			cervejas = cervejas - 1;
			System.out.println("Agora são " + cervejas + " no freezer \n");
			
			if(cervejas == 1){
				
				System.out.println("Infelizmente acabou.. gostaria de mais cervejas ? \n");
				System.out.println("Digite 1 - para SIM");
				System.out.println("Digite 2 - para NÃO");
				opcao = teclado.nextInt();
				
				if(opcao == 1) {
					
					System.out.println("informe o numero de cervejas");
					quantidadeDeCerva = teclado.nextInt();
					
					cervejas = quantidadeDeCerva;
					System.out.println("Reabastecimento concluido \n");
				}else{
					
					System.out.println("acabou.....");
				}
			}
		}

	}

}
