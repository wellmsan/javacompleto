import java.util.Scanner;

public class ControleNota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar = "N";

        do {
            int qtdAlunos;
            String[] nomeAlunos;
            double[][] notasAlunos;
            double[] mediaAlunos;
            double maiorNota = 0, menorNota = 11;
            int qtdAprovados = 0, qtdReprovados = 0, qtdRecuperacao = 0;

            System.out.println("Quantos alunos deseja cadastrar? ");
            qtdAlunos = entrada.nextInt();
            entrada.nextLine();
            nomeAlunos = new String[qtdAlunos];
            notasAlunos = new double[qtdAlunos][2];

            for(int i = 0; i < qtdAlunos; i++) {
                System.out.println("Digite o nome do aluno " + (i+1) + ": ");
                nomeAlunos[i] = entrada.nextLine();

                for(int j = 0; j < 2; j++) {
                    boolean notaValida = false;
                    do{
                        System.out.println("Digite a nota " + (j+1) + " de "  + nomeAlunos[i] + ": ");
                        double nota = entrada.nextDouble();
                        entrada.nextLine();
                        if(nota < 0 || nota > 10) {
                            System.out.println("Nota inválida!");
                            notaValida = false;
                        } else {
                            notasAlunos[i][j] = nota;
                            notaValida = true;

                            if(nota > maiorNota)
                                maiorNota = nota;

                            if(nota < menorNota)
                                menorNota = nota;
                        }
                    } while (!notaValida);
                }
            }

            for(String nome: nomeAlunos) {
                System.out.println(nome);
            }

            mediaAlunos = new double[qtdAlunos];
            System.out.println();
            System.out.println("## Resultados ##");
            for(int i = 0; i < qtdAlunos; i++) {
                double somaNota = 0, mediaAluno = 0;
                String status = "";
                System.out.print(nomeAlunos[i] + " - ");
                for(int j = 0; j < 2; j++) {
                    somaNota += notasAlunos[i][j];
                }
                mediaAluno = somaNota/2;
                mediaAlunos[i] = mediaAluno;
                if(mediaAluno >= 7 ){
                    status = "Aprovado";
                    qtdAprovados++;
                } else if(mediaAluno < 7 && mediaAluno >=5){
                    status = "Recuperação";
                    qtdRecuperacao++;
                } else {
                    status = "Reprovado";
                    qtdReprovados++;
                }
                System.out.println(" Média: " + mediaAluno + " - Status: " + status);
            }

            double mediaTurma = 0;
            for(double nota : mediaAlunos) {
                mediaTurma += nota;
            }
            System.out.println();
            System.out.println(" Média da turma: " + (mediaTurma/qtdAlunos));
            System.out.println(" Maior nota: " + maiorNota);
            System.out.println(" Menor nota: " + menorNota);
            System.out.println(" Total de Aprovados: " + qtdAprovados);
            System.out.println(" Total de Recuperação: " + qtdRecuperacao);
            System.out.println(" Total de Reprovados: " + qtdReprovados);

            System.out.println();
            System.out.println("Deseja cadastrar outra turma (Y/N)? ");
            continuar = entrada.nextLine();
        } while ("Y".equalsIgnoreCase(continuar));


    }
}
