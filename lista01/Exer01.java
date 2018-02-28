package com.gabriel.unipejava.aula05.lista;

import java.util.Scanner;
public class Exer01 {
	
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			double salario = 0, percentualAumento = 0;
			
			System.out.println("Informe seu salario (R$): ");
			salario = teclado.nextDouble();
			
			System.out.println("Informe o percentual de aumento (%): ");
			percentualAumento = teclado.nextDouble();
			
			salario = salario * (1.0f + (percentualAumento / 100.00f));
			
			System.out.println("Seu novo salario é: R$ " + salario);
			
		}
	}


