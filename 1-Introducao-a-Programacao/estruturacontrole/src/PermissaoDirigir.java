public class PermissaoDirigir {
    public static void main(String[] args){
        int idade = 16;
        boolean temCNH = true;
        boolean temPermissao = false;

        if(idade >= 18 && temCNH){
            System.out.println("Pode dirigir...");
        } else if(idade < 18 && temPermissao) {
            System.out.println("Pode dirigir, com restrição...");
        } else {
            System.out.println("Não pode dirigir...");
        }
    }
}
