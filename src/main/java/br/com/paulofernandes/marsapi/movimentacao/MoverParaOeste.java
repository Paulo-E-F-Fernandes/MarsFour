package br.com.paulofernandes.marsapi.movimentacao;


import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;
import br.com.paulofernandes.marsapi.utils.Constantes;

public class MoverParaOeste implements IMovimentacao {

	@Override
	public void executar(Robo robo, Terreno terreno) {
		if (robo.getCoordenadaX() == 0) {
			throw new IllegalArgumentException(Constantes.OESTE);
		} else {
			robo.setCoordenadaX(robo.getCoordenadaX() - 1);
		}
	}

}
