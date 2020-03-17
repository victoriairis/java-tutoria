/**
 * @author irisroques
 * 
 * Sobre modificadores de acesso, getters e setters, this e construtores.
 *  */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c1 = new Conta(1000, 200, "Joao"); // Construtor com limite, saldo e titular
		
		Conta c2 = new Conta(200, "Paulo"); // Conta apenas com saldo e titular
		
		Conta c3 = new Conta(); //
		
		System.out.println("Titular: " + c1.getTitular() + " Saldo: " +c1.getSaldo() + " Limite: " + c1.getLimite());
		
		System.out.println("Titular: " + c2.getTitular() + " Saldo: " +c2.getSaldo() + " Limite: " + c2.getLimite());

		System.out.println("Titular: " + c3.getTitular() + " Saldo: " +c3.getSaldo() + " Limite: " + c3.getLimite());

	}

}
