package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.model.Robo;

public class MoverParaSul implements Movimentacao {

	@Override
	public void executar(Robo robo, int[] terreno) {
		if (robo.getCoordenadaX() == terreno[1]) {
			System.out.println("não pode");
		} else {
			System.out.println("anda em y (y+1)");
		}
	}

}
