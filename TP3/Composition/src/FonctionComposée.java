/**
 * TP3 EXO1
 */
public class FonctionComposée extends Fonction{
    private Fonction f,g;

    public FonctionComposée(Fonction f, Fonction g) {this.f = f; this.g = g;}

    @Override
    public int applique(int x) {return f.applique(g.applique(x));}

    public static void main(String[] args) {
        Increment f = new Increment();
        Double g = new Double();
        FonctionComposée h = new FonctionComposée(g, f);
        System.out.println("h(h(6)) = " + h.iteree(2,6));
        FonctionComposée i = new FonctionComposée(f, h);
        System.out.println("i(i(6)) = " + i.iteree(2,6));
    }
}
