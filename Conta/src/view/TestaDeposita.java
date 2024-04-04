package view;

import model.ContaPoupanca;
import model.ValorInvalidoException;

public class TestaDeposita {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca(1000);
        try {
            cp.deposita(-100);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }
    }
}