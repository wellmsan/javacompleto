package aula01;

import java.util.Scanner;

public class Algoritmo {

    public static void main(String args[]) {
        int numero;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = ler.nextInt();
        if (numero % 2 != 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }

}
