/**
 * EXO2 TP1
 * 15/03/2020
 */
package exo2;

/**
 * @author Laurent
 * @class Variable
 */
public class Variable implements FonctionEntiers {
	
	private Variable x = new Variable();
	
	private Variable() {}
	
	@Override
	public void affiche() {System.out.println("x");}
	
	public FonctionEntiers X() {return x;}
	
	@Override
	public FonctionEntiers derivee() {return new Constante(1);} 
}
