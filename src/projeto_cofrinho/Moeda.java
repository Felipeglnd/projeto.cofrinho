package projeto_cofrinho;

public abstract class Moeda {
	
	double valor;
	
	@Override // equals para conseguir remover da lista.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	// métodos abstratos
	public abstract String info();
	abstract double converter();

}
