/**
 * TP2 EXO1
 * 22/09/2020
 */
package EXO1;

/**
 * @class EnveloppePreTimbree
 */
public class EnveloppePreTimbree implements Enveloppe {
	private Enveloppe env = new EnveloppeStandard("test"); 
	
	
	public EnveloppePreTimbree() {}
	
	@Override
	public String getAdresse() {return env.getAdresse();}

	@Override
	public void obliterer() {}

	@Override
	public boolean estObliteree() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
