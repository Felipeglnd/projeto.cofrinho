package projeto_cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
		

	// Método para adicionar moeda na lista
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}
	// Método para removar a moeda da lista, especificando o modelo e valor.
	public void remover(Moeda m) {
		listaMoedas.remove(m);
	}
	// Método para listar as moedas adicionadas
	public void listar() {
		if(listaMoedas.isEmpty()) {
			System.out.println("Lista de moedas está vazia!");
		} else {
			for(Moeda m : listaMoedas) {
				System.out.println(m.info());
			}
		}
	}
	// Calcular o valor total do cofrinho, convertido em REAL.
	public double totalConvertido() {
		double total = 0;
		for(Moeda m : listaMoedas) {
			total += m.converter();		
		}
		return total;
	}
	

}
