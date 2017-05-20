package empilhamentoDecrescente;

public class PilhaCaixa {
	private int n;
	private int tam;
	private Caixa[] vet;

	public PilhaCaixa(int tam) {
		this.vet = new Caixa[tam];
		this.tam = tam;
		this.n = 0;
	}
	
	

	@Override
	public String toString() {
		String s = "";
		int contador = 0;
		Caixa caixa;
		while (contador < vet.length && contador < n) {
			caixa = vet[contador];
			s += caixa.getTamanho() + ";";
			contador++;
		}
		return s;
	}



	public void push(Caixa v) throws Exception {
		if (n == tam) {
			throw new Exception("Erro: a capacidade da pilha estourou!");
		} else {
			vet[n] = v;
			n++;
		}
	}

	public Caixa pop() throws Exception {
		Caixa v;
		if (vazia()) {
			throw new Exception("Erro: pilha vazia!");
		}
		v = vet[n - 1];
		n--;
		return v;
	}

	public Caixa top() {
		if (!vazia()) {
			return vet[n - 1];
		}
		return null;
	}

	public boolean vazia() {
		return n == 0;
	}

	public void libera() {
		n = 0;
	}

}
