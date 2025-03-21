import java.util.Scanner;

public class CategoriaAtleta {
    public static void main(String[] args) {
        int idade;
        String categoria;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if(idade < 5)
            categoria = "Idade inválida para competir";
         else if(idade > 5 && idade <= 10)
            categoria = "Infantil";
         else if(idade >= 11 && idade <= 15)
            categoria = "Juvenil";
         else if(idade >= 16 && idade <= 19)
            categoria = "Júnior";
         else if(idade >= 20 && idade <= 40)
            categoria = "Adulto";
         else
            categoria = "Master";

        entrada.close();

        System.out.println(categoria);
    }
}
