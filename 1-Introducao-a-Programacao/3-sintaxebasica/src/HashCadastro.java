import java.util.HashMap;

public class HashCadastro {
    public static void main(String[] args) {
        HashMap<String, Integer> cadastros = new HashMap<>();
        cadastros.put("Ana Paula", 26);
        cadastros.put("José da Silva", 32);
        cadastros.put("Everton Rebeiro", 50);

        System.out.println(cadastros);
        System.out.println(cadastros.get("Ana Paula"));

        HashMap<String, String> cpfs = new HashMap<>();
        cpfs.put("123", "Maria Antonia");
        cpfs.put("234", "Paulo Miranda");
        cpfs.put("234", "Juliana Silva");

        System.out.println(cpfs.get("234"));
    }
}
