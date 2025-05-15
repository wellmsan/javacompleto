import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor;
        String nome;
        int quantidade;

        for(int i = 0; i <= 1; i++){
            System.out.print("Nome do produto: ");
            nome = entrada.nextLine();

            System.out.print("Quantidade: ");
            quantidade = entrada.nextInt();

            System.out.print("Valor: ");
            valor = entrada.nextDouble();

            Produto produto = new Produto(nome, valor, quantidade);

            produto.exibirDetalhes();
            System.out.println(produto.getNome());
            entrada.nextLine();
        }


    }
}
