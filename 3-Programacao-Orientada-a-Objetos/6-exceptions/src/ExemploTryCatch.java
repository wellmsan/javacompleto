public class ExemploTryCatch {
    public static void main(String[] args) {

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e){
            System.out.println("Erro: divisão por zero!");
        } catch (Exception e){
            System.out.println("outros errros");
        }


    }
}
