
/**
 * @author irisroques
 * Uma superclasse � uma classe geral, com atributos e m�todos que ser�o herdados pelas classes
 * filhas.
 *  */
public class Funcionario {
	private String nome, cpf;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
