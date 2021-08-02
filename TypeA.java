public abstract class TypeA extends Legemiddel {

    protected int narkotisk;

    public TypeA(String navn, double pris, double virkestoff, int narkotisk) {
        super(navn, pris, virkestoff);
        this.narkotisk = narkotisk;
    }

    public int hentNarkotisk() {
        return this.narkotisk;
    }
}
