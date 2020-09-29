/**
 * TP2 EXO2
 */
public class TicketPerso {
    private int recharge;
    private static Date mtn = new Date(1002131548);
    private boolean abo = false;
    private int duree;
    private float prix;
    private int dateLimite;

    public TicketPerso() {recharge = 0;}

    public boolean abonnement(int duree, float prix){
        if(abo) {
            return false;
        }
        abo = true;
        this.duree = duree;
        this.dateLimite = mtn.getMaintenant().getDate() + duree;
        this.prix  = prix;
        return true;
    }// abonnement()

    public boolean valide(){
        if(abo) {
            if (mtn.getMaintenant().getDate() > dateLimite)
                return false;
            return true;
        }
        if(recharge > 0) {
            recharge--;
            return true;
        }
        return false;
    }// valide()
}
