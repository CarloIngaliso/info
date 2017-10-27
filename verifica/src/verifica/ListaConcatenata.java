
package verifica;

public class ListaConcatenata<T> {

	private final NodoConc<T> inizio;

	private NodoConc<T> iterator;

	public ListaConcatenata() {

		inizio = new NodoConc<>(null, null); //Starting bode

		iterator = inizio;

	}

	public void addNodo(T arg) {

		NodoConc<T> tmp = inizio;

		while (tmp.next != null) {

			tmp = tmp.next;

		}

		tmp.next = new NodoConc<>(arg, null);

	}

	public T getNext() {

		iterator = iterator.next;

		return iterator.info;

	}

	public boolean hasNext() {

		return (iterator.next != null);

	}

	public void restartIterator() {

		iterator = inizio;

	}

}
