package br.com.paulofernandes.marsapi.flyweight;

import java.util.HashMap;
import java.util.Map;

import br.com.paulofernandes.marsapi.movimentacao.IMovimentacao;
import br.com.paulofernandes.marsapi.movimentacao.MoverParaLeste;
import br.com.paulofernandes.marsapi.movimentacao.MoverParaNorte;
import br.com.paulofernandes.marsapi.movimentacao.MoverParaOeste;
import br.com.paulofernandes.marsapi.movimentacao.MoverParaSul;
import br.com.paulofernandes.marsapi.utils.Constantes;

public class RoboDirecoes {

	private static Map<String, IMovimentacao> direcoes = new HashMap<>(4);

	static {
		direcoes.put(Constantes.L, new MoverParaLeste());
		direcoes.put(Constantes.O, new MoverParaOeste());
		direcoes.put(Constantes.N, new MoverParaNorte());
		direcoes.put(Constantes.S, new MoverParaSul());
	}

	public static IMovimentacao pegar(String chave) {
		return direcoes.get(chave);
	}

}
