/**
 * TP2 EXO2
 */

public class Date {
    private int date;
    private static Date maintenant = new Date(1002131548);

    public Date(int date) {this.date = date;}

    public Date plus(int duree) {return new Date(date + duree);}// plus()

    public boolean avant(Date d){return d.getDate() > date;}// avant()

    //getter
    int getDate() {return date;}
    Date getMaintenant() {return maintenant;}

    //setter
    void setMaintenant(Date mtn){this.maintenant = mtn;}

    public static void main(String[] args) {
        Date d1 = new Date(1002121548);
        d1.setMaintenant(d1);
        d1.setMaintenant(d1.getMaintenant().plus(Duree.MOIS));
    }

}
