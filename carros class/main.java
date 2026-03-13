public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", 2022, 4);
        Moto moto = new Moto("Honda", 2021, 300);

        System.out.println("Informações do Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Portas: " + carro.getPortas());

        System.out.println();

        System.out.println("Informações da Moto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cilindradas: " + moto.getCilindradas());
    }
}
