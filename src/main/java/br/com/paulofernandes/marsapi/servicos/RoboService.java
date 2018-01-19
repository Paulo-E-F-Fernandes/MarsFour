package br.com.paulofernandes.marsapi.servicos;

import org.springframework.stereotype.Service;

import br.com.paulofernandes.marsapi.flyweight.RoboMovimentos;
import br.com.paulofernandes.marsapi.model.Robo;
import br.com.paulofernandes.marsapi.movimentacao.IMovimentacao;

@Service
public class RoboService {

	public String resetarPosicao(Robo robo) {
		return robo.resetarPosicao();
	}

	public String cumprimentar(Robo robo) {
		final StringBuilder cumprimento = new StringBuilder();
		cumprimento.append("Olá! Sou ");
		cumprimento.append(robo.getNome());
		cumprimento.append(" e minha posição é ");
		cumprimento.append(robo.posicaoAtual());
		cumprimento.append(".");
		return cumprimento.toString();
	}

	public String renomear(Robo marsFour, String nome) {
		if (nome != null && !nome.isEmpty()) {
			marsFour.setNome(nome);
			final StringBuilder cumprimento = new StringBuilder();
			cumprimento.append("Agora pode me chamar de ");
			cumprimento.append(marsFour.getNome());
			return cumprimento.toString();
		} else {
			throw new IllegalArgumentException("O nome informado é inválido!");
		}
	}

	public String movimentar(Robo marsFour, int[] terreno, String caminho) {
		final String[] comandos = caminho.split("");
		IMovimentacao movimentacao;

		for (final String comando : comandos) {
			movimentacao = RoboMovimentos.pegar(comando.toUpperCase());

			if (movimentacao == null) {
				throw new IllegalArgumentException(String.format("O comando %s é inválido!", comando));
			}

			movimentacao.executar(marsFour, terreno);
		}

		return marsFour.posicaoAtual();
	}

}
