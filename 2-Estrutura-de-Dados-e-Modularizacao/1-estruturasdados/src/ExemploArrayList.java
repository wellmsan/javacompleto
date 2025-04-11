import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.add(1, "JavaScript"); // Insere na posição 1

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento: " + lista.get(i));
        }

        System.out.println("A lista contém Java? " + lista.contains("Java"));


        System.out.println("Índice de C++: " + lista.indexOf("C++"));


        System.out.println("Tamanho da lista: " + lista.size());


        lista.clear();
        System.out.println("Lista após clear: " + lista);



        System.out.println(lista);
    }
}


