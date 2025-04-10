public class BuscaBinaria {
    public static void main(String[] args) {


        int[] lista = {1, 2, 4, 7, 9}; // Lista ordenada
        int inicio = 0, fim = lista.length - 1;
        int buscaValor = 4;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (lista[meio] == buscaValor) {
                System.out.println("Encontrado: " + meio);
                break;
            }
            else if (lista[meio] < buscaValor) inicio = meio + 1;
            else fim = meio - 1;
        }



    }
}
