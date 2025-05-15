public class VeiculaApp {
    public static void main(String[] args) {
        Moto moto = new Moto(160, false, "asd-qweq", "Shineray", "thunder", 1992, "Laranja");
        moto.roncoMotor();

        Carro carro = new Carro(5, "asdasd", "Renault", "Kwid", 2023, "azul");
        carro.roncoMotor();
    }
}
