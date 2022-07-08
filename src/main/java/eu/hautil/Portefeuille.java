package eu.hautil;

import java.util.HashMap;

public class Portefeuille {

    private HashMap<String, Devise> contenu;

    public HashMap<String, Devise> getContenu() {
        return contenu;
    }

    public Portefeuille() {
        contenu = new HashMap<String, Devise>();
    }

    public void ajouteDevise(Devise d) throws MonnaieDifferenteException {
        if (contenu.containsKey(d.getMonnaie())) {
            Devise test = contenu.get(d.getMonnaie()); // recuperer la devise ou la clé est la monnaie

            Devise result = test.add(d);
            contenu.replace(d.getMonnaie(), result);
        } else {
            contenu.put(d.getMonnaie(), d);
        }
    }
}
