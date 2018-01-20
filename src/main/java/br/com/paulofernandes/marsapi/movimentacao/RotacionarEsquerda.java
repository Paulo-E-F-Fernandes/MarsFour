package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.enums.DirecaoEnum;
import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;

public class RotacionarEsquerda implements IMovimentacao {

	@Override
	public void executar(Robo robo, Terreno terreno) {
		final DirecaoEnum direcao = DirecaoEnum.init(robo.getDirecao());
		robo.setDirecao(direcao.getRotacaoEsquerda());
	}

}
