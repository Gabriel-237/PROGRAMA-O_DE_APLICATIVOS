class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
}

class Eletronico extends Produto {
    private int garantia;

    public Eletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Garantia: " + garantia + " meses");
    }
}

class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Data de Validade: " + dataValidade);
    }
}

public class Main {
    public static void main(String[] args) {

        Eletronico eletronico = new Eletronico("Celular", 1500.0, 12);
        Alimento alimento = new Alimento("Arroz", 20.0, "10/12/2026");

        System.out.println("Produto Eletrônico:");
        eletronico.mostrarProduto();

        System.out.println();

        System.out.println("Produto Alimento:");
        alimento.mostrarProduto();
    }
}
