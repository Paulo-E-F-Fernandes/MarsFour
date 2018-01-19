package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.model.Robo;

public interface IMovimentacao {

	public void executar(Robo robo, int[] terreno);

}
