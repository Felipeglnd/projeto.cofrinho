package projeto_cofrinho;

class Real extends Moeda {

	@Override	// equals para conseguir remover da lista.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	public Real(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String info() {
		return "REAL: R$ " + valor;		
	}

	@Override
	double converter() {
		return valor;
	}

}
