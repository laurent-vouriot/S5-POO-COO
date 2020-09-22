/**
 * TP1 EXO 1
 * 15/03/2020
 */
package exo1;


//-------------
// imports
//-------------
import java.lang.Math;


/**
 * @author Laurent
 * @class  Point
 */
public class Point {
	private float x;
	private float y;
	
	// constructor
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float abscisse() { return x; }
	public float ordonnee() { return y; }
	
	public boolean confondu(Point p) {
		if (p.abscisse() == x && p.ordonnee() == y) 
			return true;
		else
			return false;
	}
	
	public float distance(Point p) {
		// on cast car sqrt return double
		return (float) Math.sqrt(Math.pow((p.abscisse() - x),2) + Math.pow((p.ordonnee() - y),2));
	} 
}
