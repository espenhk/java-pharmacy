public abstract class Legemiddel {
    protected String navn;
    protected static int count = 0;
    protected int id;
    protected double pris;
    protected double virkestoff;

    public Legemiddel(String navn, double pris, double virkestoff) {
        this.navn = navn;
        this.id = count++;
        this.pris = pris;
    }

    public String hentNavn() {
        return this.navn;
    }

    public int hentId() {
        return this.id;
    }

    public double hentPris() {
        return this.pris;
    }

    public double hentVirkestoff() {
        return this.virkestoff;
    }
}
