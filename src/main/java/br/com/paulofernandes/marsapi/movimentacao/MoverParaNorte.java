package br.com.paulofernandes.marsapi.movimentacao;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;
import br.com.paulofernandes.marsapi.services.MessageService;
import br.com.paulofernandes.marsapi.utils.Constantes;

public class MoverParaNorte implements IMovimentacao {

	@Autowired
	private MessageService messageService;

	@Override
	public void executar(Robo robo, Terreno terreno) {
		if (robo.getCoordenadaY() == terreno.getY()) {
			throw new IllegalArgumentException(messageService.getMessagem("movimentacao.erro", Arrays.array(robo.getNome(), Constantes.NORTE)));
		} else {
			robo.setCoordenadaY(robo.getCoordenadaY() + 1);
		}
	}

}
