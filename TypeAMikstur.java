public class TypeAMikstur extends TypeA
    implements Mikstur {

    private double volum;
    private double virkestoffPerCm2;

    public TypeAMikstur(String navn, double pris, double virkestoff,
                        int narkotisk, double volum,
                        double virkestoffPerCm2) {
        super(navn, pris, virkestoff, narkotisk);
        this.volum = volum;
        this.virkestoffPerCm2 = virkestoffPerCm2;
    }

    public double hentVolum() {
        return this.volum;
    }

    public double hentVirkestoffPerCm2() {
        return this.virkestoffPerCm2;
    }
}
