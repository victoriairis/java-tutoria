
/**
 * @author irisroques
 *  */

public class Main {
	
	/*
	 * A classe Main do Java é onde o código começa a ser executado
	 * 
	 *  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * A criação de um objeto a partir do molde da classe é chamada de instância
		 * A classe denota o tipo do objeto.
		 * No exemplo abaixo, c1 é instanciado como um objeto da classe Carro 
		 * com um construtor vazio
		 * 
		 *  */
		
		Carro c1 = new Carro();
		
		/*
		 * A chamada de métodos só pode ser feita em um objeto instânciado e é feita na forma
		 * objeto.metodo
		 * 
		 *  */
		
		c1.setVelocidade((float) 40.0);
		
		c1.acelera((float) 30.30);
		
		System.out.println(c1.getVelocidade());
		
	}

}
