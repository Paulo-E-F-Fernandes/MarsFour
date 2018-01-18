package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.enums.DirecaoEnum;
import br.com.paulofernandes.marsapi.model.Robo;

public class RotacionarEsquerda implements Movimentacao {

	@Override
	public void executar(Robo robo, int[] terreno) {
		final DirecaoEnum direcao = DirecaoEnum.init(robo.getDirecao());
		robo.setDirecao(direcao.getRotacaoEsquerda());
	}

}
