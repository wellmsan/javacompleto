public class ExemploMultiCatch {
    public static void main(String[] args) {

        try {
            int[] numeros = new int[3];
            numeros[5] = 10; // erro
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fora dos limites!");
        } catch (Exception e) {
            System.out.println("Erro genérico.");
        }


    }
}
