package br.com.paulofernandes.marsapi.model;

import br.com.paulofernandes.marsapi.enums.Constantes;

public class Robo {

	private int coordenadaX;

	private int coordenadaY;

	private String direcao;

	public Robo() {
		super();
		this.coordenadaX = 0;
		this.coordenadaY = 0;
		this.direcao = Constantes.N;
	}

	public Robo(int coordenadaX, int coordenadaY, String direcao) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.direcao = direcao;
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

	public String posicaoAtual() {
		return "(".concat(String.valueOf(coordenadaX)).concat(", ").concat(String.valueOf(coordenadaY)).concat(", ").concat(direcao).concat(")");
	}

}
