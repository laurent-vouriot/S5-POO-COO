/**
 * TP1 EXO3
 * 22/09/2020
 */
package exo3;

/**
 * @class OperateurEt
 * @author Laurent
 *
 */
public class OperateurEt implements OperateurBinaire{
	private String name = "ET";	
	
	@Override
	public boolean applique(boolean e1, boolean e2) {
		return(e1 && e2);
	}// applique()
	
	@Override
	public String getName() {return name;}
}