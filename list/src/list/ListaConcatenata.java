package list;

public class ListaConcatenata<T> {

    private NodoConc<T> testa;
    private int lunghezza;

    public ListaConcatenata() {
        testa = new NodoConc(null);
        lunghezza = 0;
    }

    public ListaConcatenata(T[] array) {
        for (int i = 0; i < array.length; i++) {
            this.add(array[i]);
        }
    }

    public void add(T data) {

        NodoConc<T> temp = new NodoConc(data);
        NodoConc<T> current = testa;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        lunghezza++;
    }

    public void add(T data, int index) {

        NodoConc<T> temp = new NodoConc(data);
        NodoConc<T> current = testa;
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }

        temp.setNext(current.getNext());

        current.setNext(temp);
        lunghezza++;
    }

    public void addHead(T data) {
        this.add(data, 0);
    }

    public void addTail(T data) {
        this.add(data, lunghezza);
    }

    public T get(int index) {

        if (index <= 0) {
            return null;
        }
        NodoConc<T> current = testa.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) {
                return null;
            }
            current = current.getNext();
        }
        return current.getInfo();
    }

    public T getHead() {
        return this.get(0);
    }

    public T getTail() {
        return this.get(lunghezza);
    }

    public boolean remove(int index) {
        if (index < 1 || index > size()) {
            return false;
        }

        NodoConc<T> current = testa;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) {
                return false;
            }

            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        lunghezza--;
        return true;
    }
   @Override
    public String toString() {
        NodoConc current = testa.getNext();
        String daStampare = "";
        while (current != null) {
            daStampare = daStampare + " " + current.getInfo().toString() + " ";
            current = current.getNext();
        }
        return daStampare;
    }
    
    public int size() {
        return lunghezza;
    }
 
}
