package list;

public class NodoConc<T> {

    public T info;
    public NodoConc<T> next;

    public NodoConc(T info) {
        this(info, null);
    }

    public NodoConc(T info, NodoConc<T> nodo) {
        this.info = info;
        this.next = nodo;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodoConc getNext() {
        return next;
    }

    public void setNext(NodoConc next) {
        this.next = next;
    }
}

