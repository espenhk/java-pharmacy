public abstract class Resept {
    protected static int count = 0;
    protected int id;
    protected Legemiddel legemiddel;
    protected String legeNavn;
    protected String pasientNavn;
    protected int reit;
    protected boolean gyldig;
    // Inkluderer pris her, men settes til 0 i HvitResept.
    // Dermed kan man teste for og hente pris i begge klasser.
    protected double pris;

    public Resept(Legemiddel legemiddel, String legeNavn,
                  String pasientNavn, int reit) {
        this.id = count++;
        this.legemiddel = legemiddel;
        this.legeNavn = legeNavn;
        this.pasientNavn = pasientNavn;
        this.reit = reit;
        sjekkGyldig(); // setter gyldig
    }

    // eneste hentemetode for gyldig; sjekker alltid
    // for gyldighet for denne returneres.
    public boolean sjekkGyldig() {
        if (hentReit() > 0) {
            this.gyldig = true;
        } else {
            this.gyldig = false;
        }
        return this.gyldig;
    }
    
    public int hentId() {
        return this.id;
    }
    
    public Legemiddel hentLegemiddel() {
        return this.legemiddel;
    }

    public String hentLegeNavn() {
        return this.legeNavn;
    }

    public String hentPasientNavn() {
        return this.pasientNavn;
    }

    public int hentReit() {
        return this.reit;
    }

    public double hentPris() {
        return this.pris;
    }
}
