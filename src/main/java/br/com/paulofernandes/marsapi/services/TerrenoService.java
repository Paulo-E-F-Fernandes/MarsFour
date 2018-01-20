package br.com.paulofernandes.marsapi.services;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;

@Service
public class TerrenoService {

	private final Terreno terreno;

	@Autowired
	protected MessageService messageService;

	public TerrenoService(@Qualifier("terreno") Terreno terreno) {
		this.terreno = terreno;
	}

	public String alterarTerreno(Terreno terrenoNovo, Robo robo) {
		if (terrenoNovo.getX() >= robo.getCoordenadaX() && terrenoNovo.getY() >= robo.getCoordenadaY()) {
			terreno.setX(terrenoNovo.getX());
			terreno.setY(terrenoNovo.getY());
			return messageService.getMessage("terreno.tamanho", Arrays.array(terreno.getX(), terreno.getY()));
		} else {
			Object[] args = Arrays.array(terrenoNovo.getX(), terrenoNovo.getY(), robo.getNome(), robo.posicaoAtual());
			throw new IllegalArgumentException(messageService.getMessage("terreno.menor.posicao.robo", args));
		}
	}

}
