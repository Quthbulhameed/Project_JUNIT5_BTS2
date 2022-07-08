package eu.hautil;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeviseTest {

    @Test
    void add() throws MonnaieDifferenteException {
        Devise m12CHF = new Devise(12, "CHF");
        Devise m14CHF = new Devise(14, "CHF");
        Devise expected = new Devise(26, "CHF");

        Devise result = m12CHF.add(m14CHF);

        Assertions.assertEquals(result, expected, "Ce n'est pas le resultat attendu");
        System.out.println(result);
    }

    @Test
    void testEquals() {
        Devise m12CHF = new Devise(12, "CHF");
        Devise m14CHF = new Devise(14, "CHF");
        Devise m14USD = new Devise(14, "USD");

        Boolean test = m12CHF.equals(m12CHF);
        Boolean test2 = m12CHF.equals(m14CHF);
        Boolean test3 = m14CHF.equals(m14USD);

        System.out.println(test + " : m12CHF est bien egale a m12CHF");
        System.out.println(test2 + " : m12CHF n'est pas egale a m14CHF");
        System.out.println(test3 + " : m14CHF n'est pas egale a m14USD");

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