package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.flyweight.RoboDirecoes;
import br.com.paulofernandes.marsapi.model.Robo;

public class MoverParaFrente implements IMovimentacao {

	@Override
	public void executar(Robo robo, int[] terreno) {
		final IMovimentacao movimentacao = RoboDirecoes.pegar(robo.getDirecao());
		movimentacao.executar(robo, terreno);
	}

}
