/**
 * TP2 EXO1
 * 22/09/2020
 */
package EXO1;

import java.util.ArrayList;

/**
 * @class EnveloppeStandard
 */
public class EnveloppeStandard implements Enveloppe {
	private String adresse;
	private ArrayList<Timbre> timbre = new ArrayList<>();
	
	public EnveloppeStandard(String adresse) {this.adresse = adresse;}
	
	public void timbrer(Timbre t) {
		this.timbre.add(t);
	}// timbrer()
	
	public Timbre decollerTimbre() {
		if (timbre.get(timbre.size() - 1) != null) {
			this.timbre.remove(timbre.size() - 1);
			return timbre.get(timbre.size() - 1);
		}
		else 
			return null;
	}// decollerTimbre()
	
	@Override
	public String getAdresse() {return adresse;}
	@Override
	public void obliterer() {		
	}
	@Override
	public boolean estObliteree() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
