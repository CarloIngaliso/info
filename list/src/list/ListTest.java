package list;

public class ListTest {

    public static void main(String[] args) {
        ListaConcatenata<String> lista = new ListaConcatenata<>();
        String[] array = {"1", "2", "3", "ciao"};
        for (int i = 0; i < array.length; i++) {
            lista.add(array[i]);
        }
        System.out.println(lista.toString());
        for (int i = 0; i < array.length - 2; i++) {
            lista.remove(i);
        }
        System.out.println(lista.toString());
    }
}
