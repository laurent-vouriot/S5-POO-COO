/**
 * TP3 EXO3
 * 06/10/2020
 */
public abstract class Agregat extends ZoneRectangulaire{
    private ZoneRectangulaire z1;
    private ZoneRectangulaire z2;

    @Override
    public void affiche() {
        z1.affiche();
        z2.affiche();
    }

    public void setZ1(ZoneRectangulaire z1) {
        this.z1 = z1;
        z1.setX(0);
        z1.setY(this.getY());
    }

    public void setZ2(ZoneRectangulaire z2) {
        this.z2 = z2;
        z2.setX(0);
        z2.setY(this.getY() + getHauteur());
    }

    // TODO setX() et setY()
}
