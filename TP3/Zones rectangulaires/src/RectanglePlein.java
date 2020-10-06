/**
 * TP3 EXO3
 * 06/10/2020
 */
public class RectanglePlein extends RectangleSimple {

    public RectanglePlein(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void affiche() {
        System.out.println("rectangle simple, largeur : " + getLargeur() + " hauteur : " + getHauteur() +
                " coord (" + getX() + "," + getY() + ")");
    }
}
