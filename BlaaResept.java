public class BlaaResept extends Resept {

    public BlaaResept(Legemiddel legemiddel, String legeNavn,
                  String pasientNavn, int reit, double pris) {
        super(legemiddel, legeNavn, pasientNavn, reit);
        this.pris = 0;
    }
}
