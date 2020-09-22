/**
 * TP2 EXO1
 * 22/09/2020
 */
package EXO1;

/**
 * @class TimbreActuel
 */
public class TimbreActuel extends TimbreAncien{
	private float tarif = 0;
	
	// constructor
	TimbreActuel() {super(0);} 
	
	// setter
	public void setTarif(float tarif) {this.tarif = tarif;}
}