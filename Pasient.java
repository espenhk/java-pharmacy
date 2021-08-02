public class Pasient {
    private String navn;
    private int fnr;
    private String gateadresse;
    private int postnr;
    private static int count = 0;
    private int id;

    public Pasient(String navn, int fnr, String gateadresse,
                   int postnr) {
        this.navn = navn;
        this.fnr = fnr;
        this.gateadresse = gateadresse;
        this.postnr = postnr;
        this.id = count++;
    }

    public String hentNavn() {
        return this.navn;
    }

    public int hentFnr() {
        return this.fnr;
    }

    public String hentGateadresse() {
        return this.gateadresse;
    }
    
    public int hentPostnr() {
        return this.postnr;
    }

    public int hentId() {
        return this.id;
    }
}
