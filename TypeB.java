public abstract class TypeB extends Legemiddel {
    protected int vanedannende;

    public TypeB(String navn, double pris, double virkestoff,
                 int vanedannende) {
        super(navn, pris, virkestoff);
        this.vanedannende = vanedannende;
    }

    public int hentVanedannende() {
        return this.vanedannende;
    }
}
