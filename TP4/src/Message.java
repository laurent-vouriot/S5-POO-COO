public class Message implements Evenement{
    private String message;

    public Message(String s) {this.message = s;}

    @Override
    public void afficher() {
        System.out.println("Message : " + message);
    }
}
