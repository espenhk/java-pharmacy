public class TypeCPille extends TypeC
    implements Pille {

    private int antallPiller;
    private double virkestoffPerPille;

    public TypeCPille(String navn, double pris, double virkestoff,
                        int antallPiller, double virkestoffPerPille) {
        super(navn, pris, virkestoff);
        this.antallPiller = antallPiller;
        this.virkestoffPerPille = virkestoffPerPille;
    }

    public int hentAntallPiller() {
        return this.antallPiller;
    }

    public double hentVirkestoffPerPille() {
        return this.virkestoffPerPille;
    }
}
