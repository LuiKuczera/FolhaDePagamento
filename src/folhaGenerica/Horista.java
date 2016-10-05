package folhaGenerica;

public class Horista extends Funcionario{
	
	private double 	valor_hora;
	private int 	numero_horas;
	private double  salario;
	
	public Horista(String nome_funcionario, int codigo_funcionario, double valor_hora, int numero_horas) {
		super(nome_funcionario, codigo_funcionario);
		// TODO Auto-generated constructor stub
		
		this.valor_hora 	= valor_hora;
		this.numero_horas 	= numero_horas;
		this.salario 		= salario();
	}
	
	protected double salario(){
		return valor_hora * numero_horas;
	}
	
	@Override
	public double getSalario() {
		return salario;
	}
	
	private String cargo(){
		return null;
	}
	
	public String getCargo(){
		return null;
	}
	
	public void gerarContraCheque(){
		double salario 			= getSalario();
		double inss				= 0;
		double vale_transporte 	= 0;
		double vale_refeicao	= 0;
		double ir				= 0;
		
		inss 			= salario * 7 / 100;
		vale_transporte = salario * 6 / 100;
		vale_refeicao	= salario * 1.5 / 100;
		
		System.out.println("DESCONTOS ... ");
		System.out.println("[INSS] -> " + inss);
		System.out.println("[VALE TRANSPORTE] -> " + vale_transporte);
		System.out.println("[VALE REFEIÇÃO]   -> " + vale_refeicao);
		
		if (salario >= 3000){
			ir = salario * 9 / 100;
			System.out.println("[IMPOSTO DE RENDA] -> " + ir);
		}
	}
}
