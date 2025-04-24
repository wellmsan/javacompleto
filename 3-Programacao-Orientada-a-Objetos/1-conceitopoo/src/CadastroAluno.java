public class CadastroAluno{
    public static void main(String[] args){
        Aluno aluno = new Aluno("Joao", 20); // Instancia aluno
        Aluno aluno2 = new Aluno("Maria", 50);

        aluno.exibirDados();
        aluno2.exibirDados();
    }
}