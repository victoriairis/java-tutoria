
/**
 * @author irisroques
 *  */

public class Main {
	
	/*
	 * A classe Main do Java � onde o c�digo come�a a ser executado
	 * 
	 *  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * A cria��o de um objeto a partir do molde da classe � chamada de inst�ncia
		 * A classe denota o tipo do objeto.
		 * No exemplo abaixo, c1 � instanciado como um objeto da classe Carro 
		 * com um construtor vazio
		 * 
		 *  */
		
		Carro c1 = new Carro();
		
		/*
		 * A chamada de m�todos s� pode ser feita em um objeto inst�nciado e � feita na forma
		 * objeto.metodo
		 * 
		 *  */
		
		c1.setVelocidade((float) 40.0);
		
		c1.acelera((float) 30.30);
		
		System.out.println(c1.getVelocidade());
		
	}

}
