/**
 * TP1 EXO2
 * 15/03/2020
 */
package exo2;

/**
 * @author Laurent
 * @class Somme
 */
public class Somme implements FonctionEntiers {
	
	private FonctionEntiers f;
	private FonctionEntiers g;
	
	//constructor
	public Somme(FonctionEntiers f, FonctionEntiers g) {
		this.f = f;
		this.g = g;
	}
	 
	@Override
	public void affiche() {
		System.out.print("(");
		f.affiche();
		System.out.print(")");
		
		System.out.print("+");
		
		System.out.print("(");
		g.affiche();
		System.out.print(")");
	}
	
	@Override 
	public FonctionEntiers derivee() {
		return new Somme(f.derivee(),g.derivee()); 
	}
 }
