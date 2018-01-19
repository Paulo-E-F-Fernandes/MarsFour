package br.com.paulofernandes.marsapi.resources;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.paulofernandes.marsapi.model.Robo;
import br.com.paulofernandes.marsapi.servicos.RoboService;

@RestController
public class MarsResource {

	@Autowired
	private Robo marsFour;

	@Autowired
	private RoboService roboService;

	private static int[] terreno;

	static {
		// Default -> 5x5
		terreno = new int[]{4,4};
	}

	@GetMapping(path = "/rest/mars/{caminho}")
	public String movimentar(@PathVariable("caminho") String caminho) {
		return roboService.movimentar(marsFour, terreno, caminho);
	}

	@GetMapping(path = "/rest/mars/resetar")
	public String resetarPosicao() {
		return roboService.resetarPosicao(marsFour);
	}

	@GetMapping(path = "/rest/mars/cumprimentar")
	public String cumprimentar() {
		return roboService.cumprimentar(marsFour);
	}

	@GetMapping(path = "/rest/mars/renomear/{nome}")
	public String renomear(@PathVariable("nome") String nome) {
		return roboService.renomear(marsFour, nome);
	}

	@ExceptionHandler({IllegalArgumentException.class})
	private void handleBadRequest(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value());
	}

}
