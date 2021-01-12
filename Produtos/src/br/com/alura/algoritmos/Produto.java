package br.com.alura.algoritmos;

public class Produto {
	//criando um campo 
	private String nome;
	private double preco;
	
	//criano um método construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//criando um getter...
	public double getPreco() {
		return preco;
	}
	
	
	public String getNome() {
		return nome;
	}
}
