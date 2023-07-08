package empresa;

public class Dolar extends Moeda{
	
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}
	

	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
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
