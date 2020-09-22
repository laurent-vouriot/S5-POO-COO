/**
 * TP1 EXO3
 * 15/03/2020
 */
package exo3;

/**
 * @author Laurent
 * @class Non
 */
public class Non implements ExpressionBooleenne{
	private ExpressionBooleenne expb;
	
	@Override
	public int evalue() {return expb.evalue() == 1 ? 0 : 1;}
	
	@Override
	public void affiche() { 
		System.out.print("NON(");
		expb.affiche();
		System.out.print(")");
	} 
	
	//constructor
	public Non(ExpressionBooleenne expb) {this.expb = expb;}
	
}
