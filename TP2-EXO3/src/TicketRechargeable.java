/**
 * TP2 EXO2
 */
public class TicketRechargeable {
    private int nbVoyages;
    private TicketSimple ticket = new TicketSolo();

    public TicketRechargeable(int nbVoyages) {this.nbVoyages = nbVoyages;}

    public int reste() {return nbVoyages;}

    public void recharge(int n) {nbVoyages += n;}

    public boolean valide() {
        if(ticket == null || !ticket.valide())
            return false;
        else if(nbVoyages > 0) {
            ticket = new TicketSolo();
            ticket.valide();
            nbVoyages--;
        }
        else if(nbVoyages == 0 && !ticket.valide())
            return false;
        return true;
    }
}