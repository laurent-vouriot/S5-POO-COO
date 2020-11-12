public interface Evenement {

    public void afficher();

    /*
    Question 1


    public enum Type { Clavier, Souris, Message}
    public Type type;

    public String message;

    public Evenement(String s) {type = Type.Message; this.message = s;}

    public void afficher() {
        if(type == Evenement.Type.Message)
            System.out.println("Message " + message);
    }

    On viole le Open Closed Principle car on doit modifier la méthode afficher...

   [Evenement | -Type type | +Evenement(Type t); + void afficher()]++-[<<I>>; Type | |+afficher()]^[Message |-String Message |+ void afficher()]

    [<<I>>; Type | |+afficher()]^[ Souris |int x,y; -Bouton b |+void ]

    [<<I>>; Type | |+afficher()]^[Clavier | -char c | + void afficher()]
    [ Souris |int x,y; -Bouton b |+void ]++-[Bouton]
    [Bouton]^[Aucun]
    [Bouton]^[Droite]
    [Bouton]^[Milieu]
    [Bouton]^[Gauche]

     */

}

