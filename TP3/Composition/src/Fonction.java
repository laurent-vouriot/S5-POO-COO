/**
 * TP3 EXO1
 */

public abstract class Fonction {

    public abstract int applique(int x);

    public int iteree(int n, int x){
        for(int i = 0; i < n; i++) {
            x = applique(x);
        }
        return x;
    }
}
