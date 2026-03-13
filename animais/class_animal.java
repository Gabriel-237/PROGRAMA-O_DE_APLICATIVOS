package exercicio_cadastro de peso.carros.java.tipos de produtos.animais.java;

class Animal {
    private String nome;
    private double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void mostrarAnimal() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
    }
}

class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.println("Raça: " + raca);
    }
}

class Gato extends Animal {
    private String cor;

    public Gato(String nome, double peso, String cor) {
        super(nome, peso);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.println("Cor: " + cor);
    }
}

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex", 10.5, "Labrador");
        Gato gato = new Gato("Mimi", 4.2, "Branco");

        System.out.println("Informações do Cachorro:");
        cachorro.mostrarAnimal();

        System.out.println();

        System.out.println("Informações do Gato:");
        gato.mostrarAnimal();
    }
}
