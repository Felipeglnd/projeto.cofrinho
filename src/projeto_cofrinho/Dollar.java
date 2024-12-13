package projeto_cofrinho;

class Dollar extends Moeda {
	
	public Dollar(double valor) {
		this.valor = valor;
	}
	

	@Override
	public String info() {
		return "DOLLAR: $ " + valor;		
	}

	@Override // equals para conseguir remover da lista.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}


	@Override  // Conversão do Dollar para o Real
	double converter() {
		return valor * 5.71;
		
	}
	
	

}
