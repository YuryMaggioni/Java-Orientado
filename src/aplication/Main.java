package aplication;

import java.util.Scanner;

import entities.Calculos;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculos calculo = new Calculos ();
		
		System.out.println("Informe a opera��o que deseja: "
				+ "\n1 - Soma"
				+ "\n2 - Subtra��o"
				+ "\n3 - Multiplica��o"
				+ "\n4 - Divis�o"
				+ "\n5 - Potencia��o"
				+ "\n6 - Ra�z quadrada"
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
			System.out.println("Informe os dados para a subtrac�o");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.subtracao());
		
		break;
		
		case 3:
			System.out.println("Informe os dados para a multiplicac�o");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.multiplicacao());
			
		break;
		
		case 4:
			System.out.println("Informe os dados para a divis�o");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.divisao());
			
		break;
		
		case 5:
			System.out.println("Informe os dados para a potencia��o");	
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
			System.out.println("Informe os dados para a porcentagem: (Primeiro quantos % voc� quer, e depois o numero que deseja saber a % \n-->7");	
			calculo.n1 = sc.nextDouble();
			calculo.n2 = sc.nextDouble();
			System.out.println(calculo.porcentagem());
			
		break;
		
		}
	}
	
}
		
		
	

