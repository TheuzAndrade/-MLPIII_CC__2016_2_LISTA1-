package br.unipe.lista01.questao01;

public class Fatura {

	private String numero = "";
	private String descricao = "";
	private int quantidade = 0;
	private double preco = 0;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getValorFatura(int quant, double valor){
		if( valor < 0){
			valor = 0;
		}
		if(quant < 0){
			quant = 0;
		}
		
		double valorFinal = quant * valor;
		return  valorFinal;
	}
}
