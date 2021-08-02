public class Fastlege extends Lege implements KommuneAvtale {
    private int avtaleNr;

    public Fastlege(String navn, int avtaleNr) {
        super(navn);
        this.avtaleNr = avtaleNr;
    }

    public int hentAvtaleNr() {
        return this.avtaleNr;
    }
}
