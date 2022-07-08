package eu.hautil;

public class MonnaieDifferenteException extends Throwable {

    private Devise devise1, devise2;

    public MonnaieDifferenteException(Devise d1, Devise d2) {
        devise1 = d1;
        devise2 = d2;
    }

    public String toString() {
        return"Monnaie differente : " + devise1.getMonnaie() + " != " + devise2.getMonnaie();
    }

}
