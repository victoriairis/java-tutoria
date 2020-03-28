/**
 * @author irisroques
 * Uma interface � uma especie de contrato, as classes que implementam uma interface s�o obrigadas
 * a implementar os m�todos que a interface descreve. Perceba que n�o h� corpo no m�todo, apenas
 * assinatura.
 *  */
public interface Autenticavel {
	
	boolean autentica(int senha);
	
	void teste();

}
