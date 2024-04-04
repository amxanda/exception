package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    
    @Override
    public void deposita(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            super.deposita(valor - 1);
        }
    }
    
    @Override
    public void atualiza(double taxa) throws ValorInvalidoException {
        double taxaP = (taxa / 100);

        super.deposita((getSaldo() * taxaP) * 3);
    }
}