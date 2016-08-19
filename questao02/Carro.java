package br.unipe.lista01.questao02;

public class Carro {
	private String cor = "";
	private String modelo = "";
	private double velocidadeAtual = 0.0;
	private double velocidadeMaxima = 0.0;	
	public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void acelerar(double valorVelo){
		this.velocidadeAtual += valorVelo;
		if(this.velocidadeAtual>this.velocidadeMaxima){
			System.out.println("Veiculo atingiu a velocidade maxima!");
			this.velocidadeAtual=this.velocidadeMaxima;
		}
	}
	
	
	
	public void ligar(){
		
	}

}
