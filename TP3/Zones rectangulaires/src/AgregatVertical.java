/**
 * TP3 EXO3
 * 06/10/2020
 */
public class AgregatVertical extends Agregat{
    public AgregatVertical(ZoneRectangulaire z1, ZoneRectangulaire z2) {

        this.hauteur = Math.max(z1.getHauteur(), z2.getHauteur());
        this.largeur = z1.getLargeur() + z2.getLargeur();
        setZ1(z1);
        setZ2(z2);

    }
}