public class Modularizacao {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("A + B = " + somar(a, b));
        System.out.println("Média = " + media(a, b));
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static double media(int a, int b){
        return (double)(a+b)/2;
    }


}
