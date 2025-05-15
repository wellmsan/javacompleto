public class Carro extends Veiculo{
    private int qtdPortas;

    public Carro(int qtdPortas, String placa, String marca, String modelo, int ano, String cor) {
        super(placa, marca, modelo, ano, cor);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void roncoMotor(){
        System.out.println("ruuuuum, ruuuum, ruuuuuuu");
    }
}
