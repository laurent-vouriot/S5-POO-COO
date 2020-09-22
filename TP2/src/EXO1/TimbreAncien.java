/**
 * TP2 EXO1
 * 22/09/2020
 */
package EXO1;

/**
 * @class TimbreAncien
 */
public class TimbreAncien implements Timbre{
	private float tarif;
	private boolean oblitere = false;
	
	TimbreAncien(float tarif) {this.tarif = tarif;}
	
	@Override
	public void obliterer() {oblitere = true;}
	@Override
	public boolean estOblitere() {return oblitere;}
	@Override
	public float getTarif() {return tarif;}
}
