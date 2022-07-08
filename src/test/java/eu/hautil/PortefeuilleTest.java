package eu.hautil;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PortefeuilleTest {

    Portefeuille portefeuille = new Portefeuille();

    @Test
    void ajouteDevise() throws MonnaieDifferenteException {

        Devise m14CHF = new Devise(14, "CHF");
        Devise m13CHF = new Devise(16, "CHF");
        Devise m12HF = new Devise(15, "USD");
        Devise m123HF = new Devise(17, "USD");

        portefeuille.ajouteDevise(m14CHF);
        portefeuille.ajouteDevise(m13CHF);
        portefeuille.ajouteDevise(m12HF);
        portefeuille.ajouteDevise(m123HF);

        System.out.println(portefeuille.getContenu());
    }


    @BeforeEach
    void AvantFonction() {
        System.out.println("\n Nous sommes avant la fonction \n");
    }

    @AfterEach
    void ApresFonction() {
        System.out.println("\n Nous sommes apres la fonction \n");
    }
}