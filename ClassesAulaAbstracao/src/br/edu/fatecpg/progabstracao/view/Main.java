package br.edu.fatecpg.progabstracao.view;

import br.edu.fatecpg.progabstracao.model.ContaBancaria;
import br.edu.fatecpg.progabstracao.model.Produto;
import br.edu.fatecpg.progabstracao.model.Pedido;
import br.edu.fatecpg.progabstracao.model.Cliente;
import br.edu.fatecpg.progabstracao.model.Usuario;

public class Main {
    public static void main(String[] args){
        // Classe ContaBancaria 
        ContaBancaria conta = new ContaBancaria();

        conta.cpfTitularConta = 1234567898; 
        conta.nomeTitularConta = "José Santos";
        conta.agenciaConta = 4355;
        conta.tipoConta = "Conta-Corrente";

        conta.abrirConta();

        ContaBancaria novaConta = new ContaBancaria();

        novaConta.cpfTitularConta = 1234567891;
        novaConta.nomeTitularConta = "João Silva";
        novaConta.agenciaConta = 4355;
        novaConta.tipoConta = "Conta-Corrente";

        if(novaConta.cpfTitularConta!=conta.cpfTitularConta){
            novaConta.abrirConta();
        }
        else{
            System.out.println("Cliente: "+novaConta.nomeTitularConta+" já possui conta aberta.");
        }

        //Classe Produto
        Produto produtoA = new Produto();
        produtoA.codigoProduto = 1;
        produtoA.nomeProduto = "Mesa";
        produtoA.categoriaProduto = "Móveis";
        produtoA.fabricanteProduto = "Marabraz";
        produtoA.valorProduto = 650.50;
        
        Produto produtoB = new Produto();
        produtoB.codigoProduto = 2;
        produtoB.nomeProduto = "Cadeira";
        produtoB.categoriaProduto = "Móveis";
        produtoB.fabricanteProduto = "Marabraz";
        produtoB.valorProduto = 75.50;
        
        System.out.println("Código: "+produtoA.codigoProduto);
        produtoA.exibirProduto();
        
        System.out.println();

        System.out.println("Código: "+produtoB.codigoProduto);
        produtoB.exibirProduto();

        // Classe Pedido
        Pedido pedido1 = new Pedido();
        pedido1.nomeClientePedido = "Júnior";
        pedido1.codigoPedido = 1;
        pedido1.nomeProdutoPedido = "Teclado sem fio";
        pedido1.quantidadeItensPedido = 2;
        pedido1.valorTotalPedido = 100.00;
        
        pedido1.opcao = '1';
        pedido1.pagamento = true;
        pedido1.finalizarPedido();

        Pedido pedido2 = new Pedido();
        pedido2.nomeClientePedido = "Júnior";
        pedido2.codigoPedido = 2;
        pedido2.nomeProdutoPedido = "Mouse sem fio";
        pedido2.quantidadeItensPedido = 2;
        pedido2.valorTotalPedido = 55.00;
        pedido2.opcao = '2'; /*implicitamente acessa o mtodo cancelarPedido */

        //Classe Cliente
        Cliente cliente1 = new Cliente();
        cliente1.cpfCliente = "123.456.789-10";
        cliente1.nomeCliente = "Carlos José";
        cliente1.telefoneCliente = "(13) 98765-4321";
        cliente1.emailCliente = "carjos@aol.com.br";
        cliente1.idadeCliente = 52;
        cliente1.notaAtendimento = 10;
        
        Cliente cliente2 = new Cliente();
        cliente2.cpfCliente = "134.756.668-12";
        cliente2.nomeCliente = "Silmara Maria";
        cliente2.telefoneCliente = "(11) 97534-5521";
        cliente2.emailCliente = "silmaria@superig.com.br";
        cliente2.idadeCliente = 33;
        cliente2.notaAtendimento = 6;

        System.out.println("Cliente "+cliente1.nomeCliente);
        cliente1.realizarPagamento();
        System.out.println();
        System.out.print("Cliente com "+cliente2.idadeCliente+" anos, ");
        cliente2.avaliarAtendimento();

        //Classe Usuário

        Usuario usuario1= new Usuario();
        usuario1.idUsuario = 1;
        usuario1.nomeUsuario = "Samuel";
        usuario1.senhaUsuario = "abC123";
        usuario1.emailUsuario = "sam@ig.com.br";
        usuario1.telefoneUsuario = "(13) 998765-4321";
        usuario1.criarUsuario();
            
    }

}