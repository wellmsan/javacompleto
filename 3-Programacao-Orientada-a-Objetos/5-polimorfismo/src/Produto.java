public class Produto {
    private String nome;
    private double preco;

    public Produto() {
        this.nome = "Indefinido";
        this.preco = 0.0;
    }

    public Produto(String nome){
        this.nome = nome;
        this.preco = 0.0;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}




