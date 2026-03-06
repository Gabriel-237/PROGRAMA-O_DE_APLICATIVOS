package EXERSICIOS1.JAVA;

public class Carro {

    private String marca;
    private int velocidade_atual;
    private int velocidade_maxima;

    public Carro(String marca, int velocidade_maxima){
        this.marca = marca;
        this.velocidade_maxima = velocidade_maxima;
        this.velocidade_atual = 0;
    }

    public void acelerar(int valor){
        if(valor > 0){
            velocidade_atual += valor;

            if(velocidade_atual > velocidade_maxima){
                velocidade_atual = velocidade_maxima;
            }
        }
    }

    public void frear(int valor){
        if(valor > velocidade_atual){
            System.out.println("Erro: não é possível frear mais que a velocidade atual.");
        }else{
            velocidade_atual -= valor;

            if(velocidade_atual < 0){
                velocidade_atual = 0;
            }
        }
    }

    public int getVelocidadeAtual(){
        return velocidade_atual;
    }


    public int getVelocidadeMaxima(){
        return velocidade_maxima;
    }

    public String getMarca(){
        return marca;
    }
}
