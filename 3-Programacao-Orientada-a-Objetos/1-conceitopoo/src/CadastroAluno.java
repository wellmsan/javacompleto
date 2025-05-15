public class CadastroAluno{
    public static void main(String[] args){
        Aluno aluno = new Aluno("Joao", 20); // Instancia aluno
        Aluno aluno2 = new Aluno("Maria", 50);

        System.out.println(aluno.getNome());

        aluno.setNome("Juliana");

        Aluno aluno3 = new Aluno("Antonia", 70);
        System.out.println(aluno.getNome());

        aluno.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}