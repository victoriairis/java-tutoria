/**
 * @author irisroques
 * Uma interface é uma especie de contrato, as classes que implementam uma interface são obrigadas
 * a implementar os métodos que a interface descreve. Perceba que não há corpo no método, apenas
 * assinatura.
 *  */
public interface Autenticavel {
	
	boolean autentica(int senha);
	
	void teste();

}
