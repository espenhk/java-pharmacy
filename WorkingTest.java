import java.util.Iterator;


public class WorkingTest {
    public static void main(String[] args) {
        // Tabell-test
        Tabell<String> tabell = new Tabell<String>(10); // indekser 0-9
        String curr = "VOID";

        tabell.settInnVedPos("A", 0);
        tabell.settInnVedPos("F", 5);

        System.out.println("*** Tester som skal passere ***");
        System.out.println(tabell.hentVedPos(0)); // forventer A
        System.out.println(tabell.hentVedPos(5)); // forventer F
        System.out.println("*** Tester som skal feile ***");
        System.out.println(tabell.hentVedPos(3)); // forventer errprint: ikke funnet
        System.out.println(tabell.hentVedPos(-1)); // forventer errprint: ugyldig pos
        System.out.println(tabell.hentVedPos(10)); // forventer errprint: ugyldig pos

        System.out.println("*** While ***");
        while (tabell.hentIterator().hasNext()) {
            curr = tabell.hentIterator().next();
            System.out.println(curr);
        }

        System.out.println("*** For-each ***");
        for (String string : tabell) {
            System.out.println(string);
        }


        // SortertEnkelListe-test
        //SortertEnkelListe<Lege> legeliste = new SortertEnkelListe<Lege>();
    }

}
