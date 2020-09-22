/**
 * TP1 EXO3
 * 15/03/2020
 */
package exo3;

/**
 * @author Laurent
 * @class Variable
 */
public class Variable implements ExpressionBooleenne{
	private boolean valeur;
	
	@Override
	public int evalue() {return valeur ? 1 : 0;}
	
	@Override
	public void affiche() { System.out.print(valeur ? "TRUE" : "FALSE");}
	
	//constructor
	public Variable(boolean valeur) {this.valeur = valeur;}
	
	//setter
	void setValeur(boolean valeur) {this.valeur = valeur;} 
}
