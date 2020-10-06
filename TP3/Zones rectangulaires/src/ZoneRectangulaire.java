/**
 * TP3 EXO3
 * 06/10/2020
 */
public abstract class ZoneRectangulaire {
    private int x;
    private int y;
    protected int hauteur;
    protected int largeur;

    public abstract void affiche();
    public int getLargeur() {return hauteur;}
    public int getHauteur() {return largeur;}

    public int getX() {return x;}
    public int getY() {return y;}

    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    public static void main(String[] args) {
        RectanglePlein r = new RectanglePlein(10,20);
        RectanglePlein e = new RectanglePlein(25,35);
        RectangleVide z1 = new RectangleVide(30,25);
        RectangleVide z2 = new RectangleVide(40,20);

        Agregat c1 = new AgregatVertical(r, e);
        // Agregat c2 = new AgregatVertical(c1, z2);

        c1.affiche();
    }
}

