/**
 * TP1 EXO3
 * 22/09/2020
 */
package exo3;

/**
 * @class OperateurOu
 * @author Laurent
 *
 */
public class OperateurOu implements OperateurBinaire{
	private String name = "OU";	
	
	@Override
	public boolean applique(boolean e1, boolean e2) {
		return(e1 || e2);
	}// applique()
	
	@Override
	public String getName() {return name;}
}

