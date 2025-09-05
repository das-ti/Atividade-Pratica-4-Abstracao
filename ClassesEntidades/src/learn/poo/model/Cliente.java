package learn.poo.model;

public class Cliente {

    public String cpfCliente;
    public String nomeCliente;
    public String telefoneCliente;
    public String emailCliente;
    public int idadeCliente;

    public int notaAtendimento;

    public void cadastrarCliente(){
        System.out.println("Cadastrado realizado.");
    }
    public void realizarPagamento() {
        System.out.println("Pagamento confirmado.");
    }
    public void avaliarAtendimento(){
        System.out.println("avaliou o atendimento com nota: "+ notaAtendimento);
        if(notaAtendimento >= 8){
            System.out.print("Satisfeito.");
        }
        else if(notaAtendimento > 5 && notaAtendimento <= 7){
            System.out.println("Satisfação parcial.");
        }
        else{
            System.out.println("Insatisfação.");
        }
        System.out.println("Obrigado por nos avaliar.");
    }
}
