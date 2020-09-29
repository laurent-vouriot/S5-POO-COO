/**
 * TP3 EXO1
 */
public class Double extends Fonction{
    @Override
    public int applique(int x) {return 2*x;}


    public static void main(String[] args){
        Double g = new Double();
        System.out.println("g(9) = " + g.applique(9));
        System.out.println("g(g(5)) = " + g.iteree(2,9));
    }
}
