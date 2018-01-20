package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.flyweight.RoboDirecoes;
import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;

public class MoverParaFrente implements IMovimentacao {

	@Override
	public void executar(Robo robo, Terreno terreno) {
		final IMovimentacao movimentacao = RoboDirecoes.pegar(robo.getDirecao());
		movimentacao.executar(robo, terreno);
	}

}
