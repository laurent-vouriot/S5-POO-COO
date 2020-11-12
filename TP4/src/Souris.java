public class Souris implements Evenement {
    private int x,y;
    private Bouton bouton;

    public Souris(int x, int y, Bouton b){
        this.x = x;
        this.y = y;
        this.bouton = b;
    }

    @Override
    public void afficher() {
        System.out.println("Souris : " + bouton + " x : " + x + " y : " + y );
    }
}
