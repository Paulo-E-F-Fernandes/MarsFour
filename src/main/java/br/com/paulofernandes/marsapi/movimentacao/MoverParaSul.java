package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;
import br.com.paulofernandes.marsapi.utils.Constantes;

public class MoverParaSul implements IMovimentacao {

	@Override
	public void executar(Robo robo, Terreno terreno) {
		if (robo.getCoordenadaY() == 0) {
			throw new IllegalArgumentException(Constantes.SUL);
		} else {
			robo.setCoordenadaY(robo.getCoordenadaY() - 1);
		}
	}

}
