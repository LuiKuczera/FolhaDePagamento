package folhaInformatica;

import java.util.Vector;

import folhaGenerica.Empresa;

public class EmpresaInformatica extends Empresa{
	
	private boolean ret;
	
	public EmpresaInformatica(String nome_empresa) {
		super(nome_empresa);
		// TODO Auto-generated constructor stub
	}
	
	

	public boolean inserirProgramador(Programador programador){
		
		if (programador instanceof Programador){
			
			ret = super.inserirFuncionario(programador);
			
			if (ret == true){
				return true;
			}
			
			return false;	
		}
		
		return false;
		
	}
	
	public boolean inserirAnalista(Analista analista){
		
		if (analista instanceof Analista){
			
			ret = super.inserirFuncionario(analista);
			
			if (ret == true){
				return true;
			}
			
			return false;	
		}
		
		return false;
	}
	
	public boolean inserirGerente(Gerente gerente){
		
		if (gerente instanceof Gerente){
			
			ret = super.inserirFuncionario(gerente);
			
			if (ret == true){
				return true;
			}
			
			return false;	
		}
		
		return false;
	}
	
	public boolean inserirDiretor(Diretor diretor){
		
		if (diretor instanceof Diretor){
			
			ret = super.inserirFuncionario(diretor);
			
			if (ret == true){
				return true;
			}
			
			return false;	
		}
		
		return false;
	}
}
