package br.com.paulofernandes.marsapi.flyweight;

import java.util.HashMap;
import java.util.Map;

import br.com.paulofernandes.marsapi.movimentacao.IMovimentacao;
import br.com.paulofernandes.marsapi.movimentacao.MoverParaFrente;
import br.com.paulofernandes.marsapi.movimentacao.RotacionarDireita;
import br.com.paulofernandes.marsapi.movimentacao.RotacionarEsquerda;
import br.com.paulofernandes.marsapi.utils.Constantes;

public class RoboMovimentos {

	private RoboMovimentos() {
		throw new UnsupportedOperationException("RoboMovimentos UnsupportedOperationException");
	}

	private static Map<String, IMovimentacao> movimentos = new HashMap<>(3);

	static {
		movimentos.put(Constantes.L, new RotacionarEsquerda());
		movimentos.put(Constantes.M, new MoverParaFrente());
		movimentos.put(Constantes.R, new RotacionarDireita());
	}

	public static IMovimentacao pegar(String chave) {
		return movimentos.get(chave);
	}

}
