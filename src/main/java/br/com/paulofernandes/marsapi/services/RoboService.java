package br.com.paulofernandes.marsapi.services;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.paulofernandes.marsapi.flyweight.RoboMovimentos;
import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;
import br.com.paulofernandes.marsapi.movimentacao.IMovimentacao;

@Service
public class RoboService {

	private final Robo robo;

	@Autowired
	protected MessageService messageService;

	public RoboService(@Qualifier("robo") Robo robo) {
		this.robo = robo;
	}

	public String resetarPosicao() {
		return robo.resetarPosicao();
	}

	public String apresentar() {
		return messageService.getMessage("robo.apresentacao", Arrays.array(robo.getNome(), robo.posicaoAtual()));
	}

	public String renomear(String nome) {
		if (nome != null && !nome.isEmpty()) {
			robo.setNome(nome);
			return messageService.getMessage("robo.nome.novo", Arrays.array(robo.getNome()));
		} else {
			throw new IllegalArgumentException(messageService.getMessagem("robo.nome.invalido"));
		}
	}

	public String movimentar(Terreno terreno, String caminho) {
		final String[] comandos = caminho.split("");
		IMovimentacao movimentacao;

		for (final String comando : comandos) {
			movimentacao = RoboMovimentos.pegar(comando.toUpperCase());

			if (movimentacao == null) {
				throw new IllegalArgumentException(messageService.getMessage("robo.comando.invalido", Arrays.array(comando)));
			}

			movimentacao.executar(robo, terreno);
		}

		return robo.posicaoAtual();
	}

}
