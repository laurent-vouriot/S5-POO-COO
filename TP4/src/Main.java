import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        List<Evenement> evenements = new ArrayList<Evenement>();
        evenements.add(new Souris(10,10, new Gauche()));
        evenements.add(new Clavier('a'));
        evenements.add(new Clavier('z'));
        evenements.add(new Souris(40,20, new Aucun()));
        for(Evenement e : evenements)
            e.afficher();
    }
}
