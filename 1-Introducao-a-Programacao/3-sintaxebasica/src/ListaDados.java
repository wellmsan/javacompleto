import java.util.ArrayList;

public class ListaDados {
    public static void main(String[] args) {

        ArrayList<String> listaCompras = new ArrayList<>();
        listaCompras.add("Feijão");
        listaCompras.add("Arroz");
        listaCompras.add("Café");
        listaCompras.add("Farinha");

        System.out.println(listaCompras);
        System.out.println(listaCompras.get(1));


    }
}
