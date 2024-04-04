package model;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo) {
		super(saldo);
	}

	@Override
	public void deposita(double valor) throws ValorInvalidoException {
		super.deposita(valor - 1);
	}

	@Override
	public void atualiza(double taxa) throws ValorInvalidoException {
		double taxaP = (taxa / 100);

		super.deposita((getSaldo() * taxaP) * 2);
	}
}