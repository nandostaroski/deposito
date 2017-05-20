package empilhamentoDecrescente;

/**
 * 
 * @author Fernando
 *
 */
public class LogisticaDeDeposito {
	PilhaCaixa a;
	PilhaCaixa b;
	PilhaCaixa c;

	/**
	 * Instancia o Objeto
	 * @param TamanhoDasPilhas tamanho das pilhas
	 */
	public LogisticaDeDeposito(int TamanhoDasPilhas) {
		a = new PilhaCaixa(TamanhoDasPilhas);
		b = new PilhaCaixa(TamanhoDasPilhas);
		c = new PilhaCaixa(TamanhoDasPilhas);
	}

	/**
	 * 
	 * @param nova Caixa a ser empilhada
	 * @throws Exception quando a pilha está com sua capacidade maxima
	 */
	void chegadaDeposito(Caixa nova) throws Exception {
		if (a.vazia()) {
			a.push(nova);
		} else if (a.top().getTamanho() >= nova.getTamanho()) {
			a.push(nova);
		} else {
			while (!a.vazia() && a.top().getTamanho() < nova.getTamanho()) {
				if (a.top().getTamanho() == TamanhoCaixa.CINCO.valor()) {
					b.push(a.pop());
				} else if (a.top().getTamanho() == TamanhoCaixa.TRES.valor()) {
					c.push(a.pop());
				}
			}
			a.push(nova);
			while (!b.vazia() || !c.vazia()) {
				if (!b.vazia()) {
					a.push(b.pop());
				} else if (!c.vazia()) {
					a.push(c.pop());
				}
			}
		}
	}
	
	/**
	 * Imprime O estado atual das pilhas
	 */
	public void imprimePilhasConsole() {
		System.out.println("A" + a);
		System.out.println("B" + b);
		System.out.println("C" + c);
		System.out.println();
	}
}
