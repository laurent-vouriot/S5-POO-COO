/**
 * TP2 EXO2
 */

public class TicketSimple {
    private int     dureeValidite;
    private float   prix;
    private boolean valide = false;
    private int     dateLimite;
    private static  Date mtn = new Date(1002131548);

    public TicketSimple(int dureeValidite, float prix) {this.dureeValidite = dureeValidite; this.prix = prix;}

    public float prix() {return prix;}

    public int getDureeValidite() {return dureeValidite;}

    public boolean valide() {
        if(!valide) {
            dateLimite = mtn.getMaintenant().getDate() + dureeValidite;
            return true;
        }
        else
            return mtn.getMaintenant().getDate() < dateLimite;
    }// valide()
}
