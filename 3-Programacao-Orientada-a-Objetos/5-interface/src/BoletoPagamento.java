public class BoletoPagamento implements  InterfacePagamento{
    private String codigoBoleto;

    public BoletoPagamento(String codigoBoleto){
        this.codigoBoleto = codigoBoleto;
    }

    public String getCodigoBoleto() {
        return codigoBoleto;
    }

    public void setCodigoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado por boleto!");
    }

    @Override
    public void emitirComprovante() {
        System.out.println("Boleto: " + getCodigoBoleto());
        realizarPagamento(1000);
    }
}
