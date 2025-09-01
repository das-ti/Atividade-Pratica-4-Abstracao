package br.edu.fatecpg.progabstracao.model;

import java.util.Scanner;

public class Produto {

    public int codigoProduto;
    public String nomeProduto;
    public String categoriaProduto;
    public String fabricanteProduto;
    public Double valorProduto;

    Scanner ler = new Scanner(System.in);

    public void cadastrarProduto() {

        codigoProduto++;
        System.out.print("Digite o nome do produto: ");
        nomeProduto = ler.next();
        System.out.print("Categoria: ");
        categoriaProduto = ler.next();
        System.out.print("Fabricante: ");
        fabricanteProduto = ler.next();
        System.out.print("Valor: R$");
        valorProduto = ler.nextDouble();
    }

    public void exibirProduto() {
        System.out.println("Nome: "+nomeProduto+" | Categoria: "+ categoriaProduto);
            System.out.println("Fabricante: "+fabricanteProduto);
            System.out.println("Valor: R$ "+ valorProduto);
    }

    public void atualizarProduto() {
        System.out.print("Os dados do produto foram atualizados.");
    }

    public void removerProduto() {
        System.out.print("Os dados do produto foram removidos.");
    }
}
