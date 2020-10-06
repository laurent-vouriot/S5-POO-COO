/**
 * TP3 EXO1
 */
public class SegmentDiscontinu extends Segment{
    private Segment s1;
    private Segment s2;

    public SegmentDiscontinu(Segment s1, Segment s2) { this.s1 = s1; this.s2 = s2;}

    @Override
    public float remplissage() {
       return (s1.remplissage() + s2.remplissage())/ 2;
    }// remplissage()

    @Override
    public Segment simplification() {
        Segment tmp1 = s1.simplification();
        Segment tmp2 = s2.simplification();

        // PAS BÔ
        if(tmp1 instanceof SegmentPlein && tmp2 instanceof SegmentPlein)
                return tmp1;
        else if(tmp1 instanceof SegmentVide && tmp2 instanceof SegmentVide)
            return tmp1;

        return new SegmentDiscontinu(tmp1, tmp2);
    }

}
