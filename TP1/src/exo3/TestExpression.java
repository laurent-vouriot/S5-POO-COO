/**
 * TP1 EXO3 
 * 22/09/2020
 */
package exo3;

/**
 * @class TestExpression
 * @author Laurent
 */
public class TestExpression {
	public static void main(String[] args) {
		Variable v = new Variable(true);
		ExpressionBooleenne e = new ExpressionBinaire(new Non(v),
													  new OperateurOu(),
													  Constante.FAUX);
		e.affiche(); System.out.println();
		System.out.println(e.evalue());
		v.setValeur(false);
		System.out.println(e.evalue());
		
	}
}
