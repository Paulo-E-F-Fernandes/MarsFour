package br.com.paulofernandes.marsapi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MarsApiApplicationTests {

	@Value("${local.server.port}")
	private int port;

	private RestTemplate restTemplate;

	@Before
	public void init() {
		restTemplate = new RestTemplate();
	}

	@Test
	public void caminhoMMRMMRMM() {
		testeCaminhoSuccess("MMRMMRMM", "(2, 0, S)");
	}

	@Test
	public void caminhoMML() {
		testeCaminhoSuccess("MML", "(0, 2, W)");
	}

	@Test
	public void caminhoMMLRepetido() {
		testeCaminhoSuccess("MML", "(0, 2, W)");
		testeCaminhoSuccess("MML", "(0, 2, W)");
	}

	@Test
	public void resetarPosicao() {
		testeCaminhoSuccess("MMRMMRM", "(2, 1, S)");
		testeApresentacao("(2, 1, S)");
		testeResetar(null);
		testeApresentacao(null);
	}

	@Test
	public void apresentacao() {
		testeApresentacao(null);
	}

	private void testeResetar(String resultado) {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:{port}/rest/mars/resetar", String.class, port);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).contains(resultado != null ? resultado : "(0, 0, N)");
	}

	private void testeApresentacao(String resultado) {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:{port}/rest/mars/apresentar", String.class, port);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).contains(resultado != null ? resultado : "(0, 0, N)");
	}

	/*
	@Test
	public void caminhoAAA() {
		testeCaminhoError("AAA", null);
	}
	 */
	private void testeCaminhoSuccess(String entrada, String resultado) {
		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:{port}/rest/mars/{caminho}", null, String.class, port, entrada);

		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).isEqualTo(resultado);
	}
	/*
	private void testeCaminhoError(String entrada, Object object) {
		RestTemplate restTemplate = new RestTemplate();

		assert

		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:{port}/rest/mars/{caminho}", null, String.class, port, entrada);


		// TODO Auto-generated method stub
		//HttpStatus.BAD_REQUEST

	}
	 */

}
