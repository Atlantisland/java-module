package academy.everyonecodes.java.optionals.enums.exercise2;

public class Outfit {
    private Socks sock;
    private Headpiece headpiece;

    public Outfit(Socks sock, Headpiece headpiece) {
        this.sock = sock;
        this.headpiece = headpiece;
    }

    public String getDescription() {

        return sock.getDescription() + " and a " + headpiece.getDescription();
    }
}
