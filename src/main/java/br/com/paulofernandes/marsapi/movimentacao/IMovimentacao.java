package br.com.paulofernandes.marsapi.movimentacao;

import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;

public interface IMovimentacao {

	public void executar(Robo robo, Terreno terreno);

}
