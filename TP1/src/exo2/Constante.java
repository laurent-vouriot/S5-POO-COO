/**
 * TP1 EXO 2 
 * 15/03/2020
 */
package exo2;

/**
 * @author Laurent
 * @class  Constante
 */
public class Constante implements FonctionEntiers {
	private int c;
	
	//constructor
	public Constante(int c) { this.c = c; }
	
	@Override
	public void affiche() {System.out.println(c);}
	
	@Override
	public FonctionEntiers derivee() {return new Constante(0);}
}
