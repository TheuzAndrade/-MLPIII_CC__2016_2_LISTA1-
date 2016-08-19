package br.unipe.lista01.questao02;

public class ProgramMain {
	public static void main(String[] args) {
		Carro c = new Carro("Vermelho","Sedan",0.0,180.0);
		c.ligar();
		c.acelerar(10.0);
		System.out.println(c.getVelocidadeAtual());
		c.acelerar(120.0);
		System.out.println(c.getVelocidadeAtual());
		c.acelerar(100.0);
		System.out.println(c.getVelocidadeAtual());
	}
	
}
