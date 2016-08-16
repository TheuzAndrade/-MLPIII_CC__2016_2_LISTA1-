package br.unipe.lista01.questao01;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Fatura f = new Fatura();
		
		System.out.println("Digite o produto: ");
		f.setDescricao(s.nextLine());
		System.out.println("Digite o número do produto: ");
		f.setNumero(s.nextLine());
		System.out.println("Digite o valor do produto");
		f.setPreco(s.nextDouble());
		System.out.println("DIgite a quantidade de produtos a comprar: ");
		f.setQuantidade(s.nextInt());
		
		System.out.println("Você adquiriu o produto: "+f.getNumero()+" - "+f.getDescricao()+", no valor unitário de R$ "+f.getPreco());

		System.out.println("Foram "+f.getQuantidade()+" produtos, portanto o valor final da fatura será R$ "+f.getValorFatura(f.getQuantidade(), f.getPreco()));
		
		s.close();
	}
}
