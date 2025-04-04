public class VerificaIdade {
    public static void main(String[] args){
        int idade = 22;

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade == 18) {
            System.out.println("Acabdou de atingir a maioridade");
        } else {
            System.out.println("Maior de idade");
        }

    }
}
