public class Hund {
    private String rasse;
    private double alter;
    private String farbe;
    private String trick;

    public Hund(String rasse, double alter, String farbe) {
        // Neues Schlüsselwort: Zugriff auf das eigenen Objekt: this (self, me)
        this.rasse = rasse;
        this.alter = alter;
        this.farbe = farbe;
    }

    public String getRasse() {
        return rasse;
    }

    public double getAlter() {
        return alter;
    }

    public String getFarbe() {
        return farbe;
    }
    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    public void adoptieren() {
        System.out.println("Der " + farbe + " " + rasse + " mit " + alter + " Jahre wurde adopiert" );
    }

    public void trickBeibringen(String trick) {
        System.out.println("Der " + farbe + " " + rasse + " mit " + alter + " Jahre hat den Trick \"" +
                 trick + "\" gelernt");
    }
}
