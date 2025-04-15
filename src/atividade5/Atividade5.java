
package atividade5;
import atividade5.model.ContaCorrente;

public class Atividade5 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000.0, "123456");

        // Mostrar saldo inicial
        System.out.println("Saldo inicial: " + conta.getSaldo());

        // Fazer um depósito
        conta.depositar(500.0);

        // Mostrar saldo após depósito
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        System.out.println("Numero da conta:  " + conta.getConta());

        

    }
    
}
