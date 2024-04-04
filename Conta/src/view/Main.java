package view;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.AtualizadorDeContas;

public class Main {

	public static void main(String[] args) {
		Conta c = new Conta(1000);
		ContaCorrente cc = new ContaCorrente(1000);
		ContaPoupanca cp = new ContaPoupanca(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.10);
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}