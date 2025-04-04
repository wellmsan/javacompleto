import java.util.ArrayList;
import java.util.Scanner;

public class ExemploLista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.add(1, "JavaScript");

        lista.remove("Python");
        lista.remove(1);

        lista.set(1, "Rails");

        System.out.println("Lista " + lista);

        for(String linguagem : lista){
            System.out.println(linguagem);
        }

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("Qual a linguagem?");
        String linguagem = entrada.nextLine();


        System.out.println("Tem " + linguagem + "? " + lista.contains(linguagem));
        System.out.println("Index " + linguagem + "? " + lista.indexOf(linguagem));

        lista.clear();
        System.out.println("Lista limpa "+ lista);


    }
}
