/**
 * 
 * @author irisroques
 * OBS: Orienta��o a objetos = OO
 * Em OO o mundo real � representado por objetos por meio da abstra��o.
 * Objetos no mundo real tem caracteristicas e performam a��es.
 * A abstra��o �, ao representar um objeto em OO, perceber quais partes desse objeto s�o
 * relevantes para o programa.
 * As caracteristicas de objetos s�o chamadas de atributos
 * As a��es de objetos s�o chamadas de m�todos (similares a fun��es em linguagem C)
 *
 */

public class Carro {
	
	/*
	 * Uma classe � o molde para a cria��o de objetos, nela se encontram os atributos, m�todos e 
	 * construtores.
	 * 
	 *  */
	
	float velocidade; //exemplo de atributo
	/*
	 * String cor, modelo, marca
	 * S�o exemplos de atributos que apesar de existirem no objeto carro do mundo real
	 * n�o s�o relevantes para o exemplo, e por isso n�o precisam ser discriminados
	 * na Classe do objeto.
	 * Isso � abstra��o
	 *  */
	
	float acelera(float kms) { // exemplo de m�todo com retorno
		return velocidade += kms; //velocidade = velocidade + kms;
	}
	
	

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	
}


