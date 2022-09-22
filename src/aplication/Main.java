package aplication;

import java.util.Scanner;

import entities.Calculos;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculos calculo = new Calculos ();
		
		System.out.println("Informe a operação que deseja: "
				+ "\n1 - Soma"
				+ "\n2 - Subtração"
				+ "\n3 - Multiplicação"
				+ "\n4 - Divisão"
				+ "\n5 - Potenciação"
				+ "\n6 - Raíz quadrada"
				+ "\n7 - Porcentagem"
				+ "\n--> ");
		int operacao = sc.nextInt();
			
		switch (operacao) {
		case 1:
			System.out.println("Informe os dados para a soma");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.soma());
			
		break;
		
		case 2: 
			System.out.println("Informe os dados para a subtracão");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.subtracao());
		
		break;
		
		case 3:
			System.out.println("Informe os dados para a multiplicacão");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.multiplicacao());
			
		break;
		
		case 4:
			System.out.println("Informe os dados para a divisão");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.divisao());
			
		break;
		
		case 5:
			System.out.println("Informe os dados para a potenciação");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.potenciacao());
			
		break;
		
		case 6:
			System.out.println("Informe os dados para a raiz quadrada");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.raizquad());
			
		break;
		
		case 7:
			System.out.println("Informe os dados para a porcentagem: (Primeiro quantos % você quer, e depois o numero que deseja saber a % \n-->7");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.porcentagem());
			
		break;
		
		}
	}
	
}
		
		
	

