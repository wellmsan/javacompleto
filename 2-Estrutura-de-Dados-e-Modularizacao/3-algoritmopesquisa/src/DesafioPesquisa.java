import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DesafioPesquisa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(3);
        lista.add(2);
        lista.add(5);
        lista.add(4);

        System.out.print("Informe um número: ");
        valor = entrada.nextInt();

        System.out.println("Encontrado no índice: " + lista.indexOf(valor));

        Collections.sort(lista);

        System.out.print("Informe outro número: ");
        valor = entrada.nextInt();

        System.out.println("Encontrado no índice: " + Collections.binarySearch(lista, valor));


    }
}
