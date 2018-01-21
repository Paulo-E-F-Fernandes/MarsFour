package br.com.paulofernandes.marsapi.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.paulofernandes.marsapi.models.Robo;
import br.com.paulofernandes.marsapi.models.Terreno;
import br.com.paulofernandes.marsapi.services.RoboService;
import br.com.paulofernandes.marsapi.services.TerrenoService;

@RestController
public class MarsController extends BaseController {

	@Autowired
	@Qualifier("robo")
	private Robo marsFour;

	@Autowired
	@Qualifier("terreno")
	private Terreno terreno;

	@Autowired
	private RoboService roboService;

	@Autowired
	private TerrenoService terrenoService;

	@PostMapping(path = "/rest/mars/{caminho}")
	public String movimentar(@PathVariable("caminho") String caminho) {
		roboService.resetarPosicao();
		return roboService.movimentar(terreno, caminho);
	}

	@GetMapping(path = "/rest/mars/resetar")
	public String resetarPosicao() {
		return roboService.resetarPosicao();
	}

	@GetMapping(path = "/rest/mars/apresentar")
	public String apresentar() {
		return roboService.apresentar();
	}

	@PutMapping(path = "/rest/mars/renomear", consumes = "text/plain")
	public @ResponseBody String renomear(@RequestBody String nome) {
		return roboService.renomear(nome);
	}

	@PutMapping(path = "/rest/mars/terreno")
	public @ResponseBody String alterarTerreno(@RequestBody Terreno terreno) {
		return terrenoService.alterarTerreno(terreno, marsFour);
	}

}
