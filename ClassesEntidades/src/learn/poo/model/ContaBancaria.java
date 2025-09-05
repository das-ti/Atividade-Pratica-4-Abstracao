package learn.poo.model;
import java.util.Scanner;

public class ContaBancaria {

    public int agenciaConta;
    public String tipoConta;
    public String nomeTitularConta;
    public int cpfTitularConta;
    public double depositarValor;

    public double saldo = 0;
    public double deposito = 0;
    public double saque = 0;

    Scanner ler = new Scanner(System.in);

    public void abrirConta() {
        double numeroConta = Math.random();

        System.out.println("Agência: " + agenciaConta + " | nº: " + numeroConta + " | Tipo da conta: " + tipoConta + "\nNome: " + nomeTitularConta + " - CPF: " + cpfTitularConta+"\n Saldo atualizado: R$ "+saldo);
        System.out.println("Conta aberta!");
        System.out.println("Realizar o primeiro depósito?\n Digite [S] sim ou outra letra para encerrar.");
        char opcao = ler.next().toUpperCase().charAt(0);

        if(opcao == 'S'){
            this.depositarValor();
        }
        else{
            System.out.println("Abertura de conta foi concluída.");
        }
    }

    public void registrarNumeroConta(){

    }
    public void depositarValor() {
        System.out.print("Digite o valor do depósito: R$ ");
        saldo += deposito = ler.nextDouble();
        
        System.out.println("Valor do depósito: R$ "+deposito+"\nSaldo atualizado: R$ "+saldo);
    }
    
    public void sacarValor() {
        System.out.print("Digite o valor do saque: R$ ");
        saldo -= saque = ler.nextDouble();
        System.out.println("Valor do saque: R$ " + saque + "\nSaldo atualizado: R$ " + saldo);  
    }

}
