package eu.hautil;

public class Devise {
    private int quantite;
    private String monnaie;

    public Devise(int somme, String monnaie) {
        this.quantite = somme;
        this.monnaie = monnaie;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getMonnaie() {
        return monnaie;
    }

    public Devise add(Devise m) throws MonnaieDifferenteException {
        if (this.getMonnaie() == m.getMonnaie()) {
            return new Devise(getQuantite() + m.getQuantite(), getMonnaie());
        } else {
            throw new MonnaieDifferenteException(this, m);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Devise) {
            Devise o = (Devise) obj; // Conversion explicite
            //            return Objects.equals(o.getMonnaie() == this.getMonnaie()) && o.getQuantite() == this.getQuantite();

            if (o.getMonnaie() == this.getMonnaie() && o.getQuantite() == this.getQuantite()) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Devise { " +
                "quantite=" + quantite +
                ", monnaie='" + monnaie + '\'' +
                " }";
    }
}
