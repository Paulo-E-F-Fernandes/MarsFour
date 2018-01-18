package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.model.Robo;

public interface Movimentacao {

	public void executar(Robo robo, int[] terreno);

}
