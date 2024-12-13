package projeto_cofrinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cofrinho cofrinho = new Cofrinho();
		double real, dollar, euro;
		int tipoMoeda;

		// Menu
		System.out.println("--- MENU COFRINHO ---");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular valor convertido para Real");
		System.out.println("0 - Encerrar");
		
		// criando a variável de entrada
		Scanner teclado = new Scanner(System.in);
		
		// variáveis para navegar no menu
		int opcao;
		opcao = teclado.nextInt();
				
		while(opcao != 0) {
			switch(opcao) {
			
			case 1: // Adicionar
				tipoMoeda = 0;
				while(tipoMoeda>4 || tipoMoeda<=0) {
					System.out.println("1 - Adicionar moeda em Real");
					System.out.println("2 - Adicionar moeda em Dollar");
					System.out.println("3 - Adicionar moeda em Euro");
					tipoMoeda = teclado.nextInt();
				}
				
				Moeda moeda = null;
				if(tipoMoeda == 1) { // Opção 1 = real
					System.out.println("Qual valor em Real você quer adicionar ?");
					real = teclado.nextDouble();
					moeda = new Real(real);
				}
				
				if(tipoMoeda == 2) { // Opção 2 = Dollar
					System.out.println("Qual valor em Dollar você quer adicionar ?");
					dollar = teclado.nextDouble();
					moeda = new Dollar(dollar);
				}
				
				if(tipoMoeda == 3) { // Opção 3 = Euro
					System.out.println("Qual valor em Euro você quer adicionar ?");
					euro = teclado.nextDouble();
					moeda = new Euro(euro);
				}				
				
				cofrinho.adicionar(moeda);
				break;
			
			case 2: // Remover
				tipoMoeda = 0;
				while(tipoMoeda>4 || tipoMoeda<=0) {
					System.out.println("1 - Remover Real");
					System.out.println("2 - Remover Dollar");
					System.out.println("3 - Remover Euro");
					tipoMoeda = teclado.nextInt();
				}
				
				moeda = null;
				if(tipoMoeda == 1) { // Opção 1 = real (remover)
					System.out.println("Qual valor em Real você quer remover ?");
					real = teclado.nextDouble();
					moeda = new Real(real);
				}
				
				if(tipoMoeda == 2) { // Opção 2 = Dollar (remover)
					System.out.println("Qual valor em Dollar você quer adicionar ?");
					dollar = teclado.nextDouble();
					moeda = new Dollar(dollar);
				}
				
				if(tipoMoeda == 3) { // Opção 3 = Euro (remover)
					System.out.println("Qual valor em Euro você quer adicionar ?");
					euro = teclado.nextDouble();
					moeda = new Euro(euro);
				}				
				
				cofrinho.remover(moeda);
				break;
				
			case 3: // Listar
				cofrinho.listar();
				break;
			
			case 4: // totalConvertido
				System.out.println("O Total do cofrinho convertido para Real é: R$ " + // Formatando para duas casas decimais
					String.format("%.2f", cofrinho.totalConvertido()));
				break;
			
			default:
				System.out.println("Opção inválida! Tente novamente ...");					
			}
			
			System.out.println("--- MENU COFRINHO ---");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular valor convertido para Real");
			System.out.println("0 - Encerrar");
			opcao = teclado.nextInt();
		}
		System.out.println("Encerrando o Programa ...");
	}
}
