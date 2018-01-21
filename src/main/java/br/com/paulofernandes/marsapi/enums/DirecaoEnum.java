package br.com.paulofernandes.marsapi.enums;

public enum DirecaoEnum {

	OESTE("W", "N", "S"),
	LESTE("E", "S", "N"),
	NORTE("N", "E", "W"),
	SUL("S", "W", "E");

	private final String posicao;
	private final String rotacaoDireita;
	private final String rotacaoEsquerda;

	private DirecaoEnum(String posicao, String rotacaoDireita, String rotacaoEsquerda) {
		this.posicao = posicao;
		this.rotacaoDireita = rotacaoDireita;
		this.rotacaoEsquerda = rotacaoEsquerda;
	}

	public String getRotacaoDireita() {
		return rotacaoDireita;
	}

	public String getRotacaoEsquerda() {
		return rotacaoEsquerda;
	}

	public static DirecaoEnum init(String posicao) {
		for (final DirecaoEnum direcaoEnum : DirecaoEnum.values()) {
			if (direcaoEnum.posicao.equalsIgnoreCase(posicao)) {
				return direcaoEnum;
			}
		}

		throw new IllegalArgumentException(String.format("No enum constant %s in ordinal %s.", DirecaoEnum.class.getCanonicalName(), posicao));
	}

}
