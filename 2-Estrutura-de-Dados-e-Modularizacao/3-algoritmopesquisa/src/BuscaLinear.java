public class BuscaLinear {
    public static void main(String[] args) {


        int[] lista = {4, 2, 7, 9, 1};
        int buscaValor = 9;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == buscaValor) {
                System.out.println("Encontrado: " + i);
            }
        }



    }
}
