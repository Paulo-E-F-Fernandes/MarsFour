package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.model.Robo;

public class MoverParaSul implements IMovimentacao {

	@Override
	public void executar(Robo robo, int[] terreno) {
		if (robo.getCoordenadaY() == 0) {
			throw new IllegalArgumentException(String.format("O %s não pode se deslocar para o Sul! Já se encontra no limite do terreno!", robo.getNome()));
		} else {
			robo.setCoordenadaY(robo.getCoordenadaY() - 1);
		}
	}

}
