import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        int diaSemana;
        String diaPorExtenso;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um dia semana (1-7): ");
        diaSemana = entrada.nextInt();

        switch (diaSemana) {
            case 1:
                diaPorExtenso = "Domingo";
                break;
            case 2:
                diaPorExtenso = "Segunda";
                break;
            case 3:
                diaPorExtenso = "Terça";
                break;
            case 4:
                diaPorExtenso = "Quarta";
                break;
            case 5:
                diaPorExtenso = "Quinta";
                break;
            case 6:
                diaPorExtenso = "Sexta";
                break;
            case 7:
                diaPorExtenso = "Sábado";
                break;
            default:
                diaPorExtenso = "Dia Inválido";
                break;
        }

        entrada.close();
        System.out.println(diaPorExtenso);

    }
}
