public class HvitResept extends Resept {

    public HvitResept(Legemiddel legemiddel, String legeNavn,
                  String pasientNavn, int reit, double pris) {
        super(legemiddel, legeNavn, pasientNavn, reit);
        this.pris = pris;
    }

}
