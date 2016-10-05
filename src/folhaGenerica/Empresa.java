package folhaGenerica;

import java.util.Vector;

import folhaInformatica.Programador;

public abstract class Empresa {
	
	private String nome_empresa;
	private Vector<Funcionario> array_funcionario_empresa;
	
	boolean funcionario_cadastrado;
	
	public Empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
		array_funcionario_empresa = new Vector<>();
	}
	
	public void gerarFolha(){
		double total_folha  = 0;
		double salario		= 0;
		
		System.out.println("\n************ " + nome_empresa + " ******************");
		System.out.println("==================================================");
		System.out.println("======== FOLHA DE PAGAMENTO ========");
		
		for (Funcionario func : array_funcionario_empresa){
			System.out.println("==================================================");
			System.out.println("[FUNCIONARIO] -> " + func.getNome_funcionario());
			System.out.println("[MATRICULA]   -> " + func.getCodigo_funcionario());
			System.out.println("[CARGO]       -> " + func.getCargo());
			salario = func.getSalario();
			total_folha = total_folha + salario;
			System.out.println("[  SALARIO  ] -> " + salario);
			func.gerarContraCheque();
		}
		System.out.println("==================================================");
		System.out.println("==================================================");
		System.out.println("TOTAL FOLHA DE PAGAMENTO: " + total_folha);
	}
	
	public void exibirFuncionario(int codigo){
		
	}
	
	public boolean inserirFuncionario(Funcionario funcionario){
		
		funcionario_cadastrado = false;
		
		for (Funcionario func : array_funcionario_empresa){
			if (func.getCodigo_funcionario() == funcionario.getCodigo_funcionario()){
				funcionario_cadastrado = true;
				break;
			}
		}
		
		if (funcionario_cadastrado == false){
			array_funcionario_empresa.addElement(funcionario);
			return true;
		}
		
		return false;
		
	}
	
}
