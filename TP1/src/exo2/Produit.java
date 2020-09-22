/**
 * TP1 EXO2 
 * 15/03/2020
 */
package exo2;


/**
 * @author Laurent
 * @class Produit 
 */
public class Produit implements FonctionEntiers{
	FonctionEntiers f;
	FonctionEntiers g;
	
	public Produit(FonctionEntiers f, FonctionEntiers g) {
		this.f = f;
		this.g = g; 
	}
	
	@Override
	public void affiche() {}
	
	@Override
	public FonctionEntiers derivee() {
		return new Somme(new Produit(f.derivee(),g), new Produit(f, g.derivee()));
	}
}
