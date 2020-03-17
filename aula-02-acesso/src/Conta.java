/** 
 * @author irisroques
 * 
 * */
public class Conta {
	
	/*
	 * As palavras reservadas private, protected e public s�o aplicadas em m�todos e atributos
	 * para controlar acesso aos membros das classes, ou seja, fazer com que haja mais
	 * seguran�a.
	 * public - acessa na propria classe, no pacote, na subclasse e no "mundo"
	 * protected - acessa na propria classe, no pacote e na subclasse
	 * sem modificador - acessa na propria classe e no pacote
	 * private - acessa apenas na classe
	 *  */
	
	
	private double limite, saldo;
	private String titular;
	
	/*
	 * Os m�todos getters e setters servem para acesso (gets) e modifica��o (sets)
	 * dos atributos.
	 * 
	 * A palavra reservada this (presente por exemplo nos setters) � uma refer�ncia ao objeto atual
	 * ou seja, o objeto que o m�todo est� chamando.
	 *  */
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	/*
	 * Os construtores de um objeto s�o usados para criar os objetos com caracteristicas 
	 * pre-definidas. Quando a classe � criada tamb�m � criado automaticamente um construtor vazio.
	 *  */
	public Conta(double limite, double saldo, String titular) {
		super();
		this.limite = limite;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	 /* Construtores podem ter apenas um atributo inicialisavel, dois, ou todos*/
	

	
	
}
