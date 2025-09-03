package br.edu.fatecpg.progabstracao.model;

public class Usuario {
    public int idUsuario;
    public String nomeUsuario;
    public String senhaUsuario;
    public String emailUsuario;
    public String telefoneUsuario;

    public void criarUsuario(){
        System.out.println("Cadastro do usuário.");
        this.criarSenha();
    }
    public void criarSenha(){
        System.out.println("Digite sua senha: ");
        this.salvarUsuario();
    }
    public void salvarUsuario(){
        System.out.println("Usuário Cadastrado.");    
    }
    public void liberarAcesso(){
        System.out.println("Acesso liberado!");
    }
}
