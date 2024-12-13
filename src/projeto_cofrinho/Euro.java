package projeto_cofrinho;

class Euro extends Moeda {
	
	public Euro(double valor) {
		this.valor = valor;
	}

	@Override    // equals para conseguir remover da lista.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String info() {
		return "EURO: $ " + valor;		
	}

	@Override   // Conversão do Euro para Real.
	double converter() {
		return valor * 6.17;
		
	}

}
