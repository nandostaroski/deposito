package empilhamentoDecrescente;

public class Caixa {
	private TamanhoCaixa tamanho;

	public Caixa(TamanhoCaixa tamanho) {
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho.valor();
	}
}

enum TamanhoCaixa {
	TRES(3),CINCO(5),SETE(7);

	public int tamanho;
	TamanhoCaixa(int tam) {
		this.tamanho = tam;
	}
	int valor() {
		return tamanho;
	}
	
	
}