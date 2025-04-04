import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
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
