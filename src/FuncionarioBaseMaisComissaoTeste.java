
public class FuncionarioBaseMaisComissaoTeste {

	public static void main(String[] args) {
		
		FuncionarioBaseMaisComissao empregado = new FuncionarioBaseMaisComissao("João", "Guilherme", "22542189641", 10000, .06, 300);
		
		System.out.println("Dados do empregado obtidos através dos métodos get().");
		
		System.out.printf("%n%s %s%n", "O nome é", empregado.getNome());
		
		System.out.printf("%n%s %s%n", "O sobrenome é", empregado.getSobrenome());
		
		System.out.printf("%n%s %s%n", "O CPF é", empregado.getCpf());

		System.out.printf("%s %.2f%n", "O total de vendas é", empregado.getVendasBruto());
		
		System.out.printf("%s %.2f%n", "A taxa de comissão é", empregado.getTaxaComissao());
		
		System.out.printf("%s %.2f%n", "O salário base é", empregado.getSalarioBase());
		
		empregado.setSalarioBase(1000);
		
		System.out.printf("%n%s:%n%n%s%n", "Informações atualizadas obtidas através do toString()", empregado.toString());

	}

}
