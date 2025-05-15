public class Carro {
    String modelo;
    int ano;

    public void ligar(){
        System.out.println("Carro Ligado");
    }

    public void desligar(){
        System.out.println("Carro Desligado");
    }

    public int subirMarcha(int marchaAtual){
        return marchaAtual + 1;
    }


}





