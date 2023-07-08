package empresa;

public class Euro extends Moeda{
	public Euro(double valorInicial) {
		this.valor = valorInicial;
	}
	

	@Override
	public void info() {
		System.out.println("Euro -"+valor);
		
	}

	@Override
	public double converter() {
		
		return this.valor * 6.1;
	}

	@Override
	public boolean equals(Object objeto) {
	if (this.getClass() != objeto.getClass()){
		return false;
	}

	Euro objectEuro = (Euro) objeto;


	if (this.valor != objectEuro.valor){
		return false;

	}
	
	return true;
	}
}
