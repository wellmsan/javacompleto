public class MediaVetor {
    public static void main(String[] args) {
        int[] numeros = {40, 5, 10, 16, 25};
        int soma = 0;
        double media;

        for(int numero : numeros){
            soma = soma + numero;
        }

        media = (double) soma / numeros.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}
