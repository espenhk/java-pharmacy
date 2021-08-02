public class TypeAPille extends TypeA 
    implements Pille {

    private int antallPiller;
    private double virkestoffPerPille;

    public TypeAPille(String navn, double pris, double virkestoff,
                        int narkotisk, int antallPiller,
                        double virkestoffPerPille) {
        super(navn, pris, virkestoff, narkotisk);
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
