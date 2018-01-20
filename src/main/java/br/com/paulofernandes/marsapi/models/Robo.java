package br.com.paulofernandes.marsapi.models;

import org.springframework.stereotype.Component;

import br.com.paulofernandes.marsapi.utils.Constantes;

@Component
public class Robo {

	private final int coordenadaXInicial;
	private int coordenadaX;
	private final int coordenadaYInicial;
	private int coordenadaY;
	private final String direcaoInicial;
	private String direcao;

	private String nome = "M4rs Four";

	public Robo() {
		super();
		this.coordenadaXInicial = this.coordenadaX = 0;
		this.coordenadaYInicial = this.coordenadaY = 0;
		this.direcaoInicial = this.direcao = Constantes.N;
	}

	public Robo(int coordenadaX, int coordenadaY, String direcao) {
		super();
		this.coordenadaXInicial = this.coordenadaX = coordenadaX;
		this.coordenadaYInicial = this.coordenadaY = coordenadaY;
		this.direcaoInicial = this.direcao = direcao;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String posicaoAtual() {
		return "(".concat(String.valueOf(coordenadaX)).concat(", ").concat(String.valueOf(coordenadaY)).concat(", ").concat(direcao).concat(")");
	}

	public String resetarPosicao() {
		coordenadaX = coordenadaXInicial;
		coordenadaY = coordenadaYInicial;
		direcao = direcaoInicial;
		return posicaoAtual();
	}

}
