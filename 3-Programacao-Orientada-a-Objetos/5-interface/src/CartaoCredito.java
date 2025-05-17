public class CartaoCredito implements InterfacePagamento {
    private String numeroCartao;
    private String titular;

    public CartaoCredito(String numeroCartao, String titular) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void realizarPagamento(double valor) {
        double valorFinal = valor - (valor * 0.01);
        System.out.println("Pagamento realizado com sucesso, com desconto: " + valorFinal );
    }

    @Override
    public void emitirComprovante() {
        System.out.println("Cartão: " + getNumeroCartao());
        System.out.println("Titular: " + getTitular());
        realizarPagamento(1000);
    }
}
