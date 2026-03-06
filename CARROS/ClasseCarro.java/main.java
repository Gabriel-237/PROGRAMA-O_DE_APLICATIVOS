package EXERSICIOS1.JAVA;

public class Main {
    
    public static void main(String[] args) {

        Carro carro1 = new Carro("Chevrolet", 200);

        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Velocidade máxima: " + carro1.getVelocidadeMaxima());

        carro1.acelerar(50);
        System.out.println("Velocidade atual: " + carro1.getVelocidadeAtual());

        carro1.acelerar(180);
        System.out.println("Velocidade após acelerar muito: " + carro1.getVelocidadeAtual());

        carro1.frear(30);
        System.out.println("Velocidade após frear: " + carro1.getVelocidadeAtual());

        carro1.frear(500); 
    }
}
