package empresa;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	
	public void adicionarMoedas(Moeda moeda) {
		this.listaMoedas.add(moeda);
		
	}
	public void listarMoedas( ) {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Seu Cofrinho Está Vazio");
			return;
		}
		
		for(Moeda moeda : this.listaMoedas){
			moeda.info();
			
		}
		
	}
	public boolean Remover(Moeda moeda){
		return this.listaMoedas.remove(moeda);
	}

	public double totalMoedasConvertido() {
		if (this.listaMoedas.isEmpty())
		return 0;
	
	double valorAcumulado =0;

	for (Moeda moeda :this.listaMoedas){
		valorAcumulado = valorAcumulado + moeda.converter();
		
	}
	return valorAcumulado;
}
}
