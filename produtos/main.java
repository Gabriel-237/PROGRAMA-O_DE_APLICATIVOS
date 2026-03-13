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
