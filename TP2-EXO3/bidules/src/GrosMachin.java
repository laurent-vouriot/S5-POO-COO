/**
 * TP2 EXO3
 */
public class GrosMachin extends Machin{
    private static boolean b = false;

    public GrosMachin() {super();}

    public void glouglou() {
        super.glouglou();
        b = !b;
    }

    public boolean getB() {return b;}
}
