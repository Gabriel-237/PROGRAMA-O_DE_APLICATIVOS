class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano: " + getAno());
    }
}

class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }
  
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Portas: " + getPortas());
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + getCilindradas());
    }
}

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", 2022, 4);
        Moto moto = new Moto("Honda", 2021, 300);

        System.out.println("Informações do Carro:");
        carro.exibirInformacoes();

        System.out.println();

        System.out.println("Informações da Moto:");
        moto.exibirInformacoes();
    }
}
