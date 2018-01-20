package br.com.paulofernandes.marsapi.movimentacao;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;
import br.com.paulofernandes.marsapi.services.MessageService;
import br.com.paulofernandes.marsapi.utils.Constantes;

public class MoverParaLeste implements IMovimentacao {

	@Autowired
	private MessageService messageService;

	@Override
	public void executar(Robo robo, Terreno terreno) {
		if (robo.getCoordenadaX() == terreno.getX()) {
			throw new IllegalArgumentException(messageService.getMessagem("movimentacao.erro", Arrays.array(robo.getNome(), Constantes.LESTE)));
		} else {
			robo.setCoordenadaX(robo.getCoordenadaX() + 1);
		}
	}

}
