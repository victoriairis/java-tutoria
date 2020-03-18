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
	
	/*
	 * Os métodos podem ter modificadores de assinatura 
	 * (palavras reservadas que alteram propriedades)
	 *  eles serão estudados mais para frente de acordo com os assuntos em que se encaixam
	 *  
	 *   final: no contexto do uso de herança, significa que o método não pode ser sobrescrito 
	 *   por classes filhas.
	 *   
	 *   abstract: as classes filhas (ou seja, que herdam caracteristicas desse método) são 
	 *   obrigadas a implementar esse método
	 *   
	 *   static: o método é acessado diretamente pela classe, não pelo objeto instanciado.
	 *   
	 *   throws <exceptions> : indicam as excessões que o método joga
	 * 
	 *  */
	
	

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	
}


