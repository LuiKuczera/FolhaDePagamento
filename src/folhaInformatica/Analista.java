package folhaInformatica;

import folhaGenerica.Horista;

public class Analista extends Horista{
	
	public Analista(String nome_funcionario, int codigo_funcionario, double valor_hora, int numero_horas) {
		super(nome_funcionario, codigo_funcionario, valor_hora, numero_horas);
		// TODO Auto-generated constructor stub
	}
	
	private String cargo(){
		return "Analista";
	}
	
	public String getCargo(){
		return cargo();
	}
	
}
