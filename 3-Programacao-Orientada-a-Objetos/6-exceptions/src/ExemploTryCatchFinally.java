public class ExemploTryCatchFinally {
    public static void main(String[] args) {

        try {
            String texto = "Java";
            System.out.println(texto.charAt(10)); // erro
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Índice inválido!");
        } finally {
            System.out.println("Bloco finally sempre será executado.");
        }



    }
}
