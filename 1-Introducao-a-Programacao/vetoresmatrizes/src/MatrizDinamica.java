public class MatrizDinamica {
    public static void main(String[] args) {

        int[][] matrizDinamica = new int[2][3];
        matrizDinamica[0][0] = 10;
        matrizDinamica[1][2] = 20;

        for (int[] linha : matrizDinamica) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

    }
}
