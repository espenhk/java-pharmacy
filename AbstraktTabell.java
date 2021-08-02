public interface AbstraktTabell<E> extends Iterable<E> {

    public boolean settInnVedPos(E obj, int pos);

    public E hentVedPos(int pos);

    // iterator()-metode arves fraa Iterable<E>

}
