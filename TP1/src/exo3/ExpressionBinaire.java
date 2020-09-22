/**
 * TP 1 EXO3
 * 22/09/2020
 */
package exo3;

/**
 * @class ExpressionBinaire
 * @author Laurent
 */
public class ExpressionBinaire implements ExpressionBooleenne{
	private ExpressionBooleenne expb1;
	private ExpressionBooleenne expb2;
	private OperateurBinaire op;
	
	public ExpressionBinaire(ExpressionBooleenne expb1, OperateurBinaire op ,ExpressionBooleenne expb2) {
		this.expb1 = expb1;
		this.expb2 = expb2;
		this.op = op;
	}// ExpressionBinaire() 
	
	@Override
	public int evalue() { 
		boolean b1;
		boolean b2;
		
		if (expb1.evalue() == 1)
			b1 = true; 
		else
			b1 = false;

		if (expb1.evalue() == 2)
			b2 = true; 
		else
			b2 = false;
		
		return op.applique(b1, b2) ? 1 : 0;
	}// evalue()
	
	@Override
	public void affiche() {
		expb1.affiche(); 
		System.out.print(" " + op.getName() + " ");
		expb2.affiche();
		
		// System.out.print(expb1.evalue() + " " + op.getName() + " " + expb2.evalue());
	} //affiche()
	
}
