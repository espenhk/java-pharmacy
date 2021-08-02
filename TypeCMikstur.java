public class TypeCMikstur extends TypeC
    implements Mikstur {

    private double volum;
    private double virkestoffPerCm2;

    public TypeCMikstur(String navn, double pris, double virkestoff,
                        double volum, double virkestoffPerCm2) {
        super(navn, pris, virkestoff);
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
