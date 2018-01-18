package br.com.paulofernandes.marsapi;

import org.junit.Test;

import br.com.paulofernandes.marsapi.enums.Constantes;
import br.com.paulofernandes.marsapi.enums.DirecaoEnum;
import br.com.paulofernandes.marsapi.model.Robo;
import br.com.paulofernandes.marsapi.movimentacao.RotacionarDireita;
import br.com.paulofernandes.marsapi.movimentacao.RotacionarEsquerda;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class MarsApiApplicationTests {

	@Test
	public void contextLoads() {
		final Robo robo = new Robo();
		System.out.println(robo.posicaoAtual());

		final RotacionarDireita d = new RotacionarDireita();
		final RotacionarEsquerda e = new RotacionarEsquerda();

		d.executar(robo, null);
		System.out.println(robo.posicaoAtual());

		e.executar(robo, null);
		System.out.println(robo.posicaoAtual());

		//final Robo robo2 = new Robo(7,6, Constantes.S);
		//System.out.println(robo2.posicaoAtual());

		DirecaoEnum a = DirecaoEnum.init(Constantes.N);
		System.out.println(a.getRotacaoDireita());
		System.out.println(a.getRotacaoEsquerda());

		a = DirecaoEnum.init(Constantes.S);
		System.out.println(a.getRotacaoDireita());
		System.out.println(a.getRotacaoEsquerda());


	}

}
