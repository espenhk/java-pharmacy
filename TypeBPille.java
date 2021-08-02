public class TypeBPille extends TypeB
    implements Pille {

    private int antallPiller;
    private double virkestoffPerPille;

    public TypeBPille(String navn, double pris, double virkestoff,
                        int vanedannende, int antallPiller,
                        double virkestoffPerPille) {
        super(navn, pris, virkestoff, vanedannende);
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
