public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        double total = calcularTotal(preco, quantidade);
        System.out.println("Nome: " + nome + " - Qtd: " + quantidade + " Preço: " + preco + " Total: " + total);
    }

    public double calcularTotal(double preco, int quantidade){
        double valorTotal = preco * quantidade;
        return valorTotal;
    }

    // GET/SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
