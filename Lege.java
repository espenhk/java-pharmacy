public class Lege implements Lik {
    private String navn; // unikt

    public Lege(String navn) {
        this.navn = navn;
    }

    public boolean samme(String navn) {
        if (this.navn.equals(navn)) {
            return true;
        }
        return false;
    }

    public String hentNavn() {
        return this.navn;
    }
}
