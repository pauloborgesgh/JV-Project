package empresa;

import java.util.Scanner;

public class Menu {
	private Scanner scanner;
	private Cofrinho cofrinho;
	public Menu() {
		scanner = new Scanner(System.in);
		cofrinho = new Cofrinho();
		
		
	}
	
	public void Menu(){
	System.out.println("---Menu- Cofrinho");
	System.out.println("1 - Adicionar");
	System.out.println("2 - Remover Moeda");
	System.out.println("3 - Listar Moeda");
	System.out.println("4 - Calcular Valor total convertido");
	System.out.println("0 - Encerrar");
	
	String opcaoUsuario = scanner.next();
	
	//while (opcaoUsuario != 0) {
		switch(opcaoUsuario) {
		case "0":
			System.out.println("Sistema Encerrado");
			break;
		case "1":
			secoundMenu();
			Menu();
			break;
		case "2":

			secoundMenuRemover();
			Menu();
			break;	
		case "3":
			cofrinho.listarMoedas();
			Menu();
			break;
		case "4":
			double valorConvertido = cofrinho.totalMoedasConvertido();
			System.out.println("Valor total convertido para Real:"+ valorConvertido);
			Menu();
		default:
			System.out.println("Opção invalido");
			Menu();
			break;
			
	
	}
	
	}
	public void secoundMenu() {
		System.out.println("Escolha a Moeda");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar ");
		System.out.println("3 - Euro");
		
		int opcaoMoeda = scanner.nextInt();
		System.out.println("Digite o valor :");
		
		String valorTmoeda = scanner.next();
		
		valorTmoeda = valorTmoeda.replace(",", ".");
		
		double valorMoeda = Double.parseDouble(valorTmoeda);
		
		try {
			if (valorTmoeda != ("1,2,3")) {
				System.out.println("você digitou uma letra favor digite um numero");
				secoundMenu();
			}
		} catch (Exception e) {
			System.out.println("você digitou uma letra favor digite um numero");
			secoundMenu();
		}
		
		Moeda moeda = null;
		if(opcaoMoeda == 1) {
			 moeda = new Real(valorMoeda);
			//System.out.println("Valor Em Real adicionado com Sucesso " + valorMoeda);
			
		}else if(opcaoMoeda == 2) {
			 moeda = new Dolar(valorMoeda);
			 
			//System.out.println("Valor Em Dolar adicionado com Sucesso " + valorMoeda);
		}else if(opcaoMoeda == 3) {
			 moeda = new Euro(valorMoeda);
			;
			//System.out.println("Valor Em Euro adicionado com Sucesso " + valorMoeda);
		}else {
			System.out.println("Moeda inexistente");
		}
		cofrinho.adicionarMoedas(moeda);
		
		
	}
	public void secoundMenuRemover() {
		System.out.println("Escolha a Moeda");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar ");
		System.out.println("3 - Euro");
		
		int opcaoMoeda = scanner.nextInt();
		System.out.println("Digite o valor :");
		
		String valorTmoeda = scanner.next();
		
		valorTmoeda = valorTmoeda.replace(",", ".");
		
		double valorMoeda = Double.parseDouble(valorTmoeda);
		Moeda moeda = null;
		if(opcaoMoeda == 1) {
			 moeda = new Real(valorMoeda);
			//System.out.println("Valor Em Real adicionado com Sucesso " + valorMoeda);
			
		}else if(opcaoMoeda == 2) {
			 moeda = new Dolar(valorMoeda);
			 
			//System.out.println("Valor Em Dolar adicionado com Sucesso " + valorMoeda);
		}else if(opcaoMoeda == 3) {
			 moeda = new Euro(valorMoeda);
			;
			//System.out.println("Valor Em Euro adicionado com Sucesso " + valorMoeda);
		}else {
			
		}
		boolean removerMoeda = cofrinho.Remover(moeda);
		if(removerMoeda){
			System.out.println("Moeda Removida Com Sucesso");
		}else{
			System.out.println("Você não tem Moeda Com esse valor");
		}
		
		
	}
}
