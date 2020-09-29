/**
 * TP2 EXO2
 */
public class Reduction50 extends TicketSimple{
    private TicketSimple t;

    public Reduction50(TicketSimple t){
        super(t.getDureeValidite(), t.prix() / 2);
        this.t = t;
    }

    public static void main(String[] args) {
        TicketSimple t = new Reduction50(new Ticket1Jour());
        t.valide();
        System.out.println(t.prix());
    }
}
