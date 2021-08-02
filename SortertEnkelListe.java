import java.util.Iterator;

public class SortertEnkelListe<E extends Comparable & Lik> implements AbstraktSortertEnkelListe<E> {
    private Node forste;
    private Node siste;
    private Iterator<E> iterator;

    public SortertEnkelListe() {
        this.forste = null;
        this.siste = null;
        this.iterator = iterator();
    }

    public void settInn(E elem) {
        Node ny = new Node(elem);
        Node temp = forste;
        if (temp == null) { // tom liste
            forste = temp;
            siste = temp;
        } else if (forste == siste) { // ett objekt
            if (elem.compareTo(forste.hentObj()) < 0) { // inn som forste
                forste = temp;
                forste.neste = siste;
            } else { // inn som siste
                siste = temp;
                forste.neste = siste;
            }
        } else { // mer enn ett objekt
            while (temp != null) { // TODO one-off?
                if (

    }

    public E hentFraNokkel(String nokkel) {
        E temp = null;
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp.samme(nokkel)) {
                return temp;
            }
        }

        return null;
    }

    public Iterator<E> iterator() {
        return new SortertEnkelListeIterator();
    }

    public Iterator<E> hentIterator() {
        return this.iterator();
    }

    private class SortertEnkelListeIterator implements Iterator<E> {
        private Node denne;
        private Node neste;

        public SortertEnkelListeIterator () {
            this.denne = forste;
            this.neste = forste.neste;
        }

        public boolean hasNext() {
            if (neste != null) {
                return true;
            }
            else {
                return false;
            }
        }

        public E next() {
            Node temp;
            if (hasNext()) {
                temp = denne;
                denne.neste = denne.neste.neste;
                denne = denne.neste;
                return temp.obj;
            }
            return null;
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
    } // end SortertEnkelListeIterator

    private class Node {
        private E obj;
        private Node neste;

        public Node(E obj) {
            this.obj = obj;
            this.neste = null;
        }

        public E hentObj() {
            return this.obj;
        }

        public Node hentNeste() {
            return this.neste;
        }
    } // end Node
} // end SortertEnkelListe
