package learn.poo.model;

public class Carro {

    public String modelo;
    public String cor;
    public Double capacidadeTanque;
    private boolean ligado = false;

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O Carro foi ligado!");
        } else {
            System.out.println("O Carro já está ligado.");
        }
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("O Carro está andando");
        } else {
            System.out.println("Ligue o Carro!");
            this.ligar();
            this.acelerar();
        }
    }

    public void frear() {
        System.out.println("O Carro está freando!");
    }

    public void buzinar() {
            System.out.println("Buzina do Carro acionada!");
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O Carro foi desligado!");
        } else {
            System.out.println("O Carro já está desligado!");
        }
    }
}
