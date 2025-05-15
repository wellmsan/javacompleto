public class Moto extends Veiculo{
    private int cilindrada;
    private boolean tipoPartida;

    public Moto(int cilindrada, boolean tipoPartida, String placa, String marca, String modelo, int ano, String cor) {
        super(placa, marca, modelo, ano, cor);
        this.cilindrada = cilindrada;
        this.tipoPartida = tipoPartida;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(boolean tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    @Override
    public void roncoMotor(){
        System.out.println("randadandan pah!");
    }
}
