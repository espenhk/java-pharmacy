import java.util.Iterator;

public class Tabell<E> implements AbstraktTabell<E> {
    private E[] objekter;
    private int lengde;
    private Iterator<E> iterator;

    public Tabell(int lengde) {
        this.lengde = lengde;
        this.objekter = (E[]) new Object[lengde];
        this.iterator = iterator();
    }
    
    public boolean settInnVedPos(E obj, int pos) {
        if (ledigVedPos(pos)) {
            this.objekter[pos] = obj;
            return true;
        }
        return false;

    }

    public E hentVedPos(int pos) {
        if (!gyldigPos(pos)) {
            // ugyldig posisjon, maa avbryte kjoring for aa unngaa ArrayIndexOutOfBoundsException
            return null;
        } // TODO try catch? ryddigere

        return this.objekter[pos]; // hvis ledig (tom) pos, er dette null
    }

    public boolean gyldigPos(int pos) {
        if (pos >= 0 && pos <= this.lengde-1) {
            return true;
        }
        return false;
    }

    public boolean ledigVedPos(int pos) {
        if (gyldigPos(pos) && this.objekter[pos] == null) {
            return true;
        }
        return false;
    }


    public Iterator<E> iterator() {
        return new TabellIterator();
    }

    public Iterator<E> hentIterator() {
        return this.iterator;
    }

    private class TabellIterator implements Iterator<E> {
        private E denne;
        private int count;
        private int inc = 1;

        public TabellIterator() {
            this.denne = null;
            this.count = 0;
        }

        public boolean hasNext() {
            inc = 1;
            if (this.count == 0) { // forste element
                if (objekter[0] != null) { // hvis treff paa forste
                    return true;
                }
            }

            while (hentVedPos(count+inc) == null) {
                if (!gyldigPos(count+inc)) {
                    return false;
                }
                //System.out.println("** Sjekker pos: " + (count+inc));
                //System.out.printf("Count: %d, Inc: %d\n", count, inc);
                inc++;
            }

            //System.out.println("hasNext() treff ved pos: " + (count+inc));
            //System.out.printf("Count: %d, Inc: %d\n", count, inc);
            return true;
        }

        public E next() {
            if (this.hasNext()) { // TODO if's uelegante?
                if (this.count == 0) {
                    count+=inc;
                    return objekter[0];
                }
                E temp;
                count+= inc;
                temp = objekter[count];
                //System.out.println("next() treff ved pos: " + count);
                return temp;
            }

            System.out.println("Count: " + count);
            return null;
        }

        public void remove() { 
            throw new UnsupportedOperationException();
        } // skal ikke implementeres

    }
}
