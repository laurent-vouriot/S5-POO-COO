/**
 * TP1 EXO3
 * 15/03/2020
 */
package exo3;


/**
 * @author Laurent
 * @class Constante
 */
public class Constante extends Variable{
	public static final Constante VRAI = new Constante(true);
	public static final Constante FAUX = new Constante(false);

	private Constante(boolean b) {super(b);}
}
