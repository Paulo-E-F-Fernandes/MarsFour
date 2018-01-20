package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.enums.DirecaoEnum;
import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;

public class RotacionarDireita implements IMovimentacao {

	@Override
	public void executar(Robo robo, Terreno terreno) {
		final DirecaoEnum direcaoEnum = DirecaoEnum.init(robo.getDirecao());
		robo.setDirecao(direcaoEnum.getRotacaoDireita());
	}

}