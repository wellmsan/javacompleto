import java.util.*;

public class ControleNotaMelhorado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        Map<String, double[]> alunoNotas = new HashMap<>();
        int qtdAprovados = 0, qtdReprovados = 0, qtdRecuperacao = 0;
        do {
            System.out.println("##### SISTEMA DE NOTAS #####");
            System.out.println("1 - Cadastrar Alunos");
            System.out.println("2 - Notas dos Alunos");
            System.out.println("3 - Resultado da Turma");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    String continuaCadastro = "N";

                    do {
                        String nome;
                        double[] notas = new double[2];
                        System.out.println("Nome do aluno: ");
                        nome = entrada.nextLine();

                        for(int i = 0; i < 2; i++){
                            System.out.println("Nota " + (i+1) + ": ");
                            notas[i] = entrada.nextDouble();
                        }
                        alunoNotas.put(nome, notas);
                        entrada.nextLine();

                        System.out.print("Cadastrar outro aluno (S/N)? ");
                        continuaCadastro = entrada.nextLine();

                    } while ("S".equalsIgnoreCase(continuaCadastro));
                    break;
                case 2:
                    System.out.println();
                    for(String nome : alunoNotas.keySet()){
                        double somaNota = 0, mediaAluno = 0;
                        String status = "";
                        for(double nota: alunoNotas.get(nome)){
                            somaNota += nota;
                        }
                        mediaAluno = somaNota/2;
                        if(mediaAluno >= 7) {
                            status = "Aprovado";
                            qtdAprovados++;
                        } else if(mediaAluno < 7 && mediaAluno >= 5) {
                            status = "Recuperação";
                            qtdRecuperacao++;
                        } else {
                            status = "reprovado";
                            qtdReprovados++;
                        }
                        System.out.println(nome + " - Média: " + mediaAluno + " - Status: " + status);
                    }
                    System.out.println();
                    break;
                case 3:
                    double somaNota = 0, mediaTurma = 0, maiorNota = 0, menorNota = 11;
                    int qtdNotas = 0;

                    System.out.println();
                    System.out.println("## Resultados ##");

                    for(String nome : alunoNotas.keySet()){
                        for(double nota: alunoNotas.get(nome)){
                            somaNota += nota;
                            if(nota > maiorNota)
                                maiorNota = nota;
                            if(nota < menorNota)
                                menorNota = nota;
                            qtdNotas++;
                        }
                        mediaTurma = somaNota/qtdNotas;
                    }

                    System.out.println(" Média da turma: " + mediaTurma);
                    System.out.println(" Maior nota: " + maiorNota);
                    System.out.println(" Menor nota: " + menorNota);
                    System.out.println(" Total de Aprovados: " + qtdAprovados);
                    System.out.println(" Total de Recuperação: " + qtdRecuperacao);
                    System.out.println(" Total de Reprovados: " + qtdReprovados);

                    System.out.println();
            }

        } while(opcao != 4);



    }
}
