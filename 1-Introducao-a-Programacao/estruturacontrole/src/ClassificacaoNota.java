import java.util.Scanner;

public class ClassificacaoNota {
    public static void main(String[] args) {
        int nota;
        String classificacao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        nota = entrada.nextInt();

        switch (nota) {
            case 10,9:
                classificacao = "Excelente";
                break;
            case 8,7:
                classificacao = "Bom";
                break;
            case 5,6:
                classificacao = "Regular";
                break;
            case 0,1,2,3,4:
                classificacao = "Reprovado";
                break;
            default:
                classificacao = "Nota inválida!";
                break;
        }

        System.out.println(classificacao);
        entrada.close();
    }
}
