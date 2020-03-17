/**
 * 
 * @author irisroques
 * OBS: Orientação a objetos = OO
 * Em OO o mundo real é representado por objetos por meio da abstração.
 * Objetos no mundo real tem caracteristicas e performam ações.
 * A abstração é, ao representar um objeto em OO, perceber quais partes desse objeto são
 * relevantes para o programa.
 * As caracteristicas de objetos são chamadas de atributos
 * As ações de objetos são chamadas de métodos (similares a funções em linguagem C)
 *
 */

public class Carro {
	
	/*
	 * Uma classe é o molde para a criação de objetos, nela se encontram os atributos, métodos e 
	 * construtores.
	 * 
	 *  */
	
	float velocidade; //exemplo de atributo
	/*
	 * String cor, modelo, marca
	 * São exemplos de atributos que apesar de existirem no objeto carro do mundo real
	 * não são relevantes para o exemplo, e por isso não precisam ser discriminados
	 * na Classe do objeto.
	 * Isso é abstração
	 *  */
	
	float acelera(float kms) { // exemplo de método com retorno
		return velocidade += kms; //velocidade = velocidade + kms;
	}
	
	

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	
}


