package folhaInformatica;

import folhaGenerica.Mensalista;

public class Diretor extends Mensalista{
	
	public Diretor(String nome, int codigo, double salario_mensal) {
		super(nome, codigo, salario_mensal);
		// TODO Auto-generated constructor stub
	}

	protected String cargo(){
		return "Diretor";
	}

}
