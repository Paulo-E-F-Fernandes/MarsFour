package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;
import br.com.paulofernandes.marsapi.utils.Constantes;

public class MoverParaLeste implements IMovimentacao {

	@Override
	public void executar(Robo robo, Terreno terreno) {
		if (robo.getCoordenadaX() == terreno.getX()) {
			throw new IllegalArgumentException(Constantes.LESTE);
		} else {
			robo.setCoordenadaX(robo.getCoordenadaX() + 1);
		}
	}

}
