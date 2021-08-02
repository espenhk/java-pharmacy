public class TypeBMikstur extends TypeB
    implements Mikstur {
    
    private double volum;
    private double virkestoffPerCm2;

    public TypeBMikstur(String navn, double pris, double virkestoff,
                        int vanedannende, double volum,
                        double virkestoffPerCm2) {
        super(navn, pris, virkestoff, vanedannende);
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
