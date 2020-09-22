/**
 * TP 1 EXO1
 * 15/03/2020
 */

package exo1;

//------------
// imports
//------------
//import exo1.Point;

/**
 * @author Laurent
 * @class  Droite
 */
public class Droite {
	private float a;
	private float b;
	
	// constructors 
	public Droite(float a, float b) {
		this.a = a; 
		this.b = b;
	}
	
	public Droite(Point p1, Point p2) {
		this.a = (p1.ordonnee() - p2.ordonnee()) / (p1.abscisse() - p2.abscisse());
		this.b = (p1.abscisse() * p2.ordonnee() - p2.abscisse() * p1.ordonnee()) 
				/ (p1.abscisse() - p2.abscisse());
		
	}
	
	public boolean appartient(Point p) {
		
		/*
		if (p.ordonnee() == a * p.abscisse() + b)
			return true;
		else 
			return false;
		*/
		
		return p.ordonnee() == a * p.abscisse() + b ? true : false; 
	}
	
	public boolean estParallele(Droite d) {
		return d.getA() == a ? true : false;  
	}
	
	public Point intersection(Droite d) {
		return new Point((d.getB() - b) / (d.getA() - a),a * ((d.getB() - b)/(a - d.getA())) + b);
	}
	
	//getters
	public float getA() {return a;}
	public float getB() {return b;}
	
	
	public static void main (String[] args){
		Point p1 = new Point(1,2);
		Point p2 = new Point(2,3);
		Point p3 = new Point(3,5);
		
		Droite d1 = new Droite(p1, p2);
		
		if (d1.appartient(p3))
			System.out.println("p3 appartient à d1");
		else 
			System.out.println("p3 appartient pas à d1");
	}
	
}
