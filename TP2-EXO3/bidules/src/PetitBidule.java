/**
 * TP2 EXO3
 */
public class PetitBidule extends Bidule{
    private GrosMachin m = new GrosMachin();
    public PetitBidule() {super();}

    public void bipbip() {
        if(!m.getB())
            super.bipbip();
        else
            m.glouglou();
    }


    public static void main(String[] args){
        GrosMachin oung = new GrosMachin();
        PetitBidule pfuit = new PetitBidule();

        pfuit.bipbip();
        oung.glouglou();
        pfuit.bipbip();
        pfuit.bipbip();
    }
}
