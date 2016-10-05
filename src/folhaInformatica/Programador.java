package folhaInformatica;

import folhaGenerica.Horista;

public class Programador extends Horista{
	
	public Programador(String nome_funcionario, int codigo_funcionario, double valor_hora, int numero_horas) {
		super(nome_funcionario, codigo_funcionario, valor_hora, numero_horas);
		// TODO Auto-generated constructor stub
	}
	
	private String cargo(){
		return "Programador";
	}
	
	public String getCargo(){
		return cargo();
	}
}
