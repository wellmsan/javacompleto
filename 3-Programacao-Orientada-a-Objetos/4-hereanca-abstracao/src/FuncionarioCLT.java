public class FuncionarioCLT extends Funcionario {
    double salarioBase;

    public double calcularSalario() {
        return salarioBase - (salarioBase * 0.1); // INSS
    }
}