package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.model.Robo;

public class MoverParaOeste implements Movimentacao {

	@Override
	public void executar(Robo robo, int[] terreno) {
		if (robo.getCoordenadaX() == 0) {
			System.out.println("não pode");
		} else {
			System.out.println("anda em x (x-1)");
		}
	}

}
