package folhaInformatica;

public class Teste {
	
	public static void main (String[] args){
		boolean ret;
		
		// Faz a instancia da empresa
		EmpresaInformatica empresa_informatica = new EmpresaInformatica("Soft Center");
		
		// Faz a instancia dos objetos com os cargos 
		Programador programador1 = new Programador("Luis Calos", 0001, 8.98, 180);
		// Faz a inserção do funcionario no array da empresa informada de acordo com o cargo
		ret = empresa_informatica.inserirProgramador(programador1);
		if (ret == true){
			System.out.println("Novo " + programador1.getCargo() + " inserido com sucesso!");
		}else{
			System.out.println("Programador " + programador1.getCargo()  + " já esta no cadastro");
		}
		
		// Faz a instancia dos objetos com os cargos 
		Programador programador2 = new Programador("Matheus Augusto", 0002, 13.98, 180);
		// Faz a inserção do funcionario no array da empresa informada de acordo com o cargo
		ret = empresa_informatica.inserirProgramador(programador2);
		if (ret == true){
			System.out.println("Novo " + programador2.getCargo()  + " inserido com sucesso!");
		}else{
			System.out.println(programador2.getCargo()  + " já esta no cadastro");
		}
				
		
		Analista	analista	= new Analista("Rafael Bisineli", 0003, 15.45, 44);
		ret = empresa_informatica.inserirAnalista(analista);
		if (ret == true){
			System.out.println("Novo " + analista.getCargo() + " inserido com sucesso!");
		}else{
			System.out.println("Analista " + analista.getCargo()  + " já esta no cadastro");
		}
		
		Gerente		gerente		= new Gerente("Laercio Nogueira", 0003, 12.560);
		ret = empresa_informatica.inserirGerente(gerente);
		if (ret == true){
			System.out.println("Novo " + gerente.getCargo() + " inserido com sucesso!");
		}else{
			System.out.println("Gerente " + gerente.getCargo()  + " já esta no cadastro");
		}
		
		Diretor		diretor		= new Diretor("Paulo Junior Gaston", 0004, 25.000);
		ret = empresa_informatica.inserirDiretor(diretor);
		if (ret == true){
			System.out.println("Novo " + diretor.getCargo() + " inserido com sucesso!");
		}else{
			System.out.println("Diretor " + diretor.getCargo()  + " já esta no cadastro");
		}
		
		
		empresa_informatica.gerarFolha();
			
		
	}

}
