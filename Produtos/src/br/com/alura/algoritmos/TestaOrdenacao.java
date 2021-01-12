package br.com.alura.algoritmos;

public class TestaOrdenacao {
	public static void main(String[] args) {
        Produto produtos[] = {
                new Produto("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasília", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };
	
	
	//selectionSort(produtos, produtos.length);
	 insertionSort(produtos, produtos.length);
	
	imprime(produtos);
	}
	private static void imprime(Produto[] produtos) {
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() +" custa "+ produto.getPreco());
		}
	}
	private static void insertionSort(Produto[] produtos, int quantidadeDeElementos) {
		for (int atual = 0; atual < quantidadeDeElementos; atual ++) {
			System.out.println("Estou na casinha " + atual);
			int analise = atual;
			while(analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {//analisando se esta na posução certa
				System.out.println("Estou trocando  " + analise + " com o " + (analise - 1)); 
				Produto produtosAnalise = produtos[analise];
				Produto produtosAnaliseMenos1 = produtos[analise - 1];
				System.out.println("Trocando " + produtosAnalise.getNome() + " " + produtosAnaliseMenos1.getNome());
				produtos[analise] = produtosAnaliseMenos1;
				produtos[analise - 1] = produtosAnalise;
				analise--;
			}
			imprime(produtos);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
	}
	private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
		for(int atual = 0; atual < quantidadeDeElementos - 1 ; atual++ ) {//na ordenação o ultimo elemento nao importa 
			System.out.println("Estou na casinha " + atual);
			int menor = buscaMenor(produtos, atual, quantidadeDeElementos -1 );//usa o produtos.length - 1, pois a function buscaMenor, usa <= no for
			System.out.println("Trocando o " + atual + " com o " + menor);
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			System.out.println("Trocando " + produtoAtual.getNome() + " " + produtoMenor.getNome());
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
		} 
		
	}
	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {

	        int maisBarato = inicio;

	        for (int atual = inicio; atual <= termino; atual++) {
	            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
	                maisBarato = atual;
	            }
	        }

	        return maisBarato;
	    } 
}
