import java.util.ArrayList;
import java.util.Collections;

public class BuscaBinariaArray {
    public static void main(String[] args) {


        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        Collections.sort(nomes); // Obrigatório!
        int indice = Collections.binarySearch(nomes, "Bruno");
        System.out.println("Encontrado no índice: " + indice);


    }
}
