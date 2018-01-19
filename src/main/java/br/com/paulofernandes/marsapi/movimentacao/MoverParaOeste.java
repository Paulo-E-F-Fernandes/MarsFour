package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.model.Robo;

public class MoverParaOeste implements IMovimentacao {

	@Override
	public void executar(Robo robo, int[] terreno) {
		if (robo.getCoordenadaX() == 0) {
			throw new IllegalArgumentException(String.format("O %s não pode se deslocar para o Oeste! Já se encontra no limite do terreno!", robo.getNome()));
		} else {
			robo.setCoordenadaX(robo.getCoordenadaX() - 1);
		}
	}

}
