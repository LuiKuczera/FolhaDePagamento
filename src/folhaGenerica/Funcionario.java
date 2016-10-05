package folhaGenerica;

public abstract class Funcionario {
	
	private String 	nome_funcionario;
	private int 	codigo_funcionario;
	
	public Funcionario(String nome_funcionario, int codigo_funcionario){
		this.setNome_funcionario(nome_funcionario);
		this.setCodigo_funcionario(codigo_funcionario);
	}
	
	void gerarContraCheque(){
	}
	
	private double salario(){
		return 0;
	}
	
	private String cargo(){
		return null;
	}
	
	public String getCargo(){
		return null;
	}
	
	public void exibir(){
		
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public int getCodigo_funcionario() {
		return codigo_funcionario;
	}

	public void setCodigo_funcionario(int codigo_funcionario) {
		this.codigo_funcionario = codigo_funcionario;
	}

	public double getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
