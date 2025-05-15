public class Calculadora {
    private int a, b;

    public Calculadora() {}

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculadora(int a){
        this.a = a;
    }

    public Calculadora(double b){
        this.b = (int) b;
    }


    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

}


class CalculadoraApp {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
//        calculadora.
    }
}





