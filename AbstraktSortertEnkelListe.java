public interface AbstraktSortertEnkelListe<E extends Comparable & Lik> 
    extends Iterable<E> {

    public void settInn(E elem);

    public E hentFraNokkel(String nokkel);

    // iterator()-metode arves fraa Iterable<E>

}
