
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Java");
        fila.add("Python");
        fila.add("PHP");
        fila.add("C#");

        System.out.println("Primeiro da fila: " + fila.peek());
        System.out.println("Remação: " + fila.poll());
        System.out.println("Fila: " + fila);
    }
}


