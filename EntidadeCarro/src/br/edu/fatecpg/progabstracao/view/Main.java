package br.edu.fatecpg.progabstracao.view;
import br.edu.fatecpg.progabstracao.model.Carro;

public class Main {
	public static void main(String[] ars) {
		
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Maverick";
		meuCarro.cor = "Preto";
		meuCarro.capacidadeTanque = 55.75;
		System.out.println("As caracteristicas do meu carro são: ");
		System.out.println("- Modelo: "+ meuCarro.modelo);
		System.out.println("- Cor: "+ meuCarro.cor);
		System.out.println("- Capacidade do Tanque: "+ meuCarro.capacidadeTanque);

		meuCarro.ligar();
		meuCarro.acelerar();
		meuCarro.desligar();
		meuCarro.frear();
		meuCarro.buzinar();
	}
}
