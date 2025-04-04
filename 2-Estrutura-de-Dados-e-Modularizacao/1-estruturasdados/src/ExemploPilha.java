
import java.util.Stack;

public class ExemploPilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("Java");
        pilha.push("Python");
        pilha.push("PHP");
        pilha.push("C#");

        System.out.println("Topo da Pilha: " + pilha.peek());
        System.out.println("Remoção: " + pilha.pop());
        System.out.println("Pilha: " + pilha);
    }
}


