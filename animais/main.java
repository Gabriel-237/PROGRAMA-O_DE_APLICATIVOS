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
