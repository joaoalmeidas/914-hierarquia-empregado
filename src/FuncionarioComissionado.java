
public class FuncionarioComissionado extends Funcionario {
	
	private double vendasBruto;
	private double taxaComissao;
	
	public FuncionarioComissionado(String nome, String sobrenome, String cpf, double vendasBruto, double taxaComissao) {
		super(nome, sobrenome, cpf);
		
		if(vendasBruto < 0.0) {
			
			throw new IllegalArgumentException("Vendas bruto deve ser maior ou igual a zero.");
			
		}
		
		if(taxaComissao < 0.0 || taxaComissao >= 1.0) {
			
			throw new IllegalArgumentException("Taxa de comiss�o deve ser maior ou igual a zero e menor que um.");
			
		}
		
		this.vendasBruto = vendasBruto;
		this.taxaComissao = taxaComissao;
	}

	public double getVendasBruto() {
		return vendasBruto;
	}

	public void setVendasBruto(double vendasBruto) {
		
		if(vendasBruto < 0.0) {
			
			throw new IllegalArgumentException("Vendas bruto deve ser maior ou igual a zero.");
			
		}
		
		
		this.vendasBruto = vendasBruto;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(double taxaComissao) {
		
		if(taxaComissao < 0.0 || taxaComissao >= 1.0) {
			
			throw new IllegalArgumentException("Taxa de comiss�o deve ser maior ou igual a zero e menor que um.");
			
		}
		
		this.taxaComissao = taxaComissao;
	}
	
	public double calculaGanhos() {
		
		return getTaxaComissao() * getVendasBruto();
		
	}
	
	@Override
	public String toString() {
		return String.format("%sVendas Bruto: %.2f\nGanhos: %.2f", super.toString(), getVendasBruto(), getTaxaComissao());
	}
	
	
	
	
}
