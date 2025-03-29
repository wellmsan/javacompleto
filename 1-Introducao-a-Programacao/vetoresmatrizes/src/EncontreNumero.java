public class EncontreNumero {
    public static void main(String[] args) {
        int[] numeros = {12, 3, 20, 8, 2};

        int maior = numeros[0];
        int menor = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println("Maior valor " + maior);
        System.out.println("Menor valor " + menor);
    }
}
