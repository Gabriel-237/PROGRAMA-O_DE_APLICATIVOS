public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Não é permitido depositar valor negativo ou zero.");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        }
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Erro: Valor de saque inválido.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente.");
            return;
        }

        saldo -= valor;

        int valorInt = (int) valor;

        int c100 = valorInt / 100;
        valorInt %= 100;

        int c50 = valorInt / 50;
        valorInt %= 50;

        int c20 = valorInt / 20;
        valorInt %= 20;

        int c10 = valorInt / 10;
        valorInt %= 10;

        int c5 = valorInt / 5;
        valorInt %= 5;

        int c2 = valorInt / 2;
        valorInt %= 2;

        int c1 = valorInt;

        System.out.println("Saque realizado!");
        System.out.println("Cédulas utilizadas:");

        if (c100 > 0) System.out.println(c100 + " cédula(s) de 100");
        if (c50 > 0) System.out.println(c50 + " cédula(s) de 50");
        if (c20 > 0) System.out.println(c20 + " cédula(s) de 20");
        if (c10 > 0) System.out.println(c10 + " cédula(s) de 10");
        if (c5 > 0) System.out.println(c5 + " cédula(s) de 5");
        if (c2 > 0) System.out.println(c2 + " cédula(s) de 2");
        if (c1 > 0) System.out.println(c1 + " cédula(s) de 1");

        System.out.println("Saldo restante: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
