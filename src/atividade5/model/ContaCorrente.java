package atividade5.model;

public class ContaCorrente {
    private double saldo;
    private String numeroConta;
    
    public ContaCorrente(double sl, String num){
        this.saldo = sl;
        this.numeroConta = num;
}
    public void depositar(double valor){
        if(valor >=0){
    this.saldo += valor;
    getSaldo();
        }
        else{
            System.out.println("Valor inválido");
        }
        }
    public double getSaldo(){
     return this.saldo;
    }
      public String getConta(){
     return this.numeroConta;
    }
      public void setConta(String novoNum){
         if(novoNum.length()<= 6){
              System.out.print("Valor invalido");
         }
         else{
             System.out.println("Valor valido");
             numeroConta = novoNum;
         }
         
    }
    
}




