/**
 * TP3 EXO2
 * 06/10/2020
 */
/*
Question 1
 la classe segment est abstraite, le autres sont des classes concrètes.
 pour remplissage il faut la redéfinir dans chaque classe.
 pour simplification on le redefini dans discontinue.
 */
public abstract class Segment  {
    public abstract float remplissage();
    public Segment simplification() {return this;}

    public static void main(String[] args) {
        SegmentVide vide = new SegmentVide();
        SegmentPlein plein = new SegmentPlein();
        SegmentDiscontinu s = new SegmentDiscontinu(plein, new SegmentDiscontinu(new SegmentDiscontinu(plein, vide), plein));
        System.out.println(s.remplissage());
        Segment s2 = s.simplification();
        System.out.println(s2.remplissage());
    }// main()
}
