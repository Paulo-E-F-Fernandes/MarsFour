package br.com.paulofernandes.marsapi.models;

import org.springframework.stereotype.Component;

@Component
public class Terreno {

	private int x;

	private int y;

	public Terreno() {
		// Tamanho default -> 5x5
		x = 4;
		y = 4;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
