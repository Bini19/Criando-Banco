
public class Main {

	public static void main(String[] args) {
		Cliente fulano = new Cliente();
		fulano.setNome("Fulano");
		
		Conta corrente = new ContaCorrente(fulano);
		Conta poupanca = new ContaPoupanca(fulano);

		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}