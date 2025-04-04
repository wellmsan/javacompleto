import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        System.out.println("Lista: " + lista);
        System.out.println("Get (1): " + lista.get(1));
        lista.remove("Python");
        System.out.println("Lista após remoção: " + lista);
        lista.add("PHP");
        System.out.println("Get (1): " + lista.get(1));
        System.out.println("Lista após inserção: " + lista);
    }
}
