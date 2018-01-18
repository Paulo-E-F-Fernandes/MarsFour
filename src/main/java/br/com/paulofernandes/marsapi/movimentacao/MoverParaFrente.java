package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.enums.Constantes;
import br.com.paulofernandes.marsapi.model.Robo;

public class MoverParaFrente implements Movimentacao {

	@Override
	public void executar(Robo robo, int[] terreno) {
		switch (robo.getDirecao()) {
		case Constantes.O:

			break;

		case Constantes.L:

			break;

		case Constantes.N:

			break;

		case Constantes.S:

			break;

		default:
			break;

		}

	}

}
