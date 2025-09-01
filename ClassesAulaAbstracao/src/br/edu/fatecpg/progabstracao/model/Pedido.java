package br.edu.fatecpg.progabstracao.model;

import java.time.LocalDate;

public class Pedido {

    public LocalDate data = LocalDate.now();
    public String nomeClientePedido;
    public int codigoPedido;
    public String nomeProdutoPedido;
    public int quantidadeItensPedido;
    public double valorTotalPedido;

    public boolean pagamento;
    public char opcao;

    public void pagarProdutoPedido() {

        if (pagamento == true) {
            System.out.println("Pagamento Confirmado!");
        } else {
            this.cancelarPedido();
        }
    }

    public void cancelarPedido() {
        System.out.println("Pedido Cancelado.");
    }

    public void finalizarPedido() {
        System.out.println("Resumo do pedido:");
        System.out.println("Data: " + data + " | código: " + codigoPedido);
        System.out.println("Nome: " + nomeClientePedido);
        System.out.println("Produto: " + nomeProdutoPedido);
        System.out.println("Quantidade de itens: " + quantidadeItensPedido);
        valorTotalPedido *= quantidadeItensPedido;
        System.out.println("Total a pagar: R$" + valorTotalPedido);

        System.out.println("[1] Pagar\n[2]Cancelar");

        if (opcao == '1') {
            System.out.println("Opção 1 | Ir para pagamento.");
            this.pagarProdutoPedido();
        } else {
            System.out.println("Opção 2");
            this.cancelarPedido();
        }
    }
}
