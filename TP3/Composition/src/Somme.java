/**
 * TP3 EXO1
 */
public class Somme {
    private Fonction f = new Increment();
    public int somme(int x, int y){
        return x * f.applique(y);
    }

    public static void main(String[] args){
        Somme s = new Somme();

        System.out.println(s.somme(1,1));
        System.out.println(s.somme(1,3));
        System.out.println(s.somme(1,10));
    }
}
