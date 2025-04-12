import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        System.out.println("#### Verifica Idade ####");
        lerDados();
    }

    public static void lerDados(){
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        boolean ehMaiorIdade;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        exibirResultado(nome, verificaMaiorIdade(idade));
    }

    public static boolean verificaMaiorIdade(int idade){
        boolean maiorIdade = false;
        if(idade >= 18){
            maiorIdade = true;
        }
        return maiorIdade;
    }

    public static void exibirResultado(String nome, boolean maiorIdade){
        System.out.println("Nome:" + nome + "\n Maior de Idade?: " + (maiorIdade ? "Sim" : "Não"));
    }
}
