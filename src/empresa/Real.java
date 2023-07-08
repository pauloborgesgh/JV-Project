package empresa;

public class Real extends Moeda{
	
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}
	

	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		
		return this.valor;
	}
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != getClass()){

		
		return false;
		}

		Real objectReal = (Real) objeto;


		if (this.valor != objectReal.valor){
			return false;

		}
		
	return true;
	}
}
