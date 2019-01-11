
public class FuncionarioBaseMaisComissao extends FuncionarioComissionado {
	
	private double salarioBase;

	public FuncionarioBaseMaisComissao(String nome, String sobrenome, String numeroSeguroSocial, double vendasBrutas,
			double taxaDeComissao, double salarioBase) {
		super(nome, sobrenome, numeroSeguroSocial, vendasBrutas, taxaDeComissao);
		
		if(salarioBase < 0.0) {
			
			throw new IllegalArgumentException("Sal�rio base precisa ser maior ou igual a 0.0");
			
		}
		
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	@Override
	public double calculaGanhos() {
		
		return getSalarioBase() + super.calculaGanhos();
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%s %s%n%s: %.2f", "Empregado sal�rio base", super.toString(), "Sal�rio Base", getSalarioBase());
		
	}
	
	
	

}
