/**
 * TP2 EXO2
 */
public class TicketMultiple {
    private TicketRechargeable ticket;

    public TicketMultiple(int nbVoyages) {ticket = new TicketRechargeable(nbVoyages);}

    public int reste() {return ticket.reste();}

    public boolean valide() {return ticket.valide();}
}
