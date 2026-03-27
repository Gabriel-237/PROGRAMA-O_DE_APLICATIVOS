# Sistema de Conta Bancária em Java

```java

public class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo restante: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void sacar(double valor, double taxa) {
        double total = valor + taxa;

        if (total <= saldo) {
            saldo -= total;
            System.out.println("Saque com taxa realizado. Saldo restante: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }
}
```

```java

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 5.0;
        double total = valor + taxa;

        if (total <= saldo) {
            saldo -= total;
            System.out.println("Saque da conta corrente realizado. Taxa de R$5 aplicada. Saldo restante: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente na conta corrente.");
        }
    }

    @Override
    public void sacar(double valor, double taxa) {
        double total = valor + taxa;

        if (total <= saldo) {
            saldo -= total;
            System.out.println("Saque da conta corrente com taxa realizado. Saldo restante: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente na conta corrente.");
        }
    }
}
```

```java
public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque da conta poupança realizado. Saldo restante: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente na conta poupança.");
        }
    }

    @Override
    public void sacar(double valor, double taxa) {
        double total = valor + taxa;

        if (total <= saldo) {
            saldo -= total;
            System.out.println("Saque da conta poupança com taxa realizado. Saldo restante: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente na conta poupança.");
        }
    }
}
```

```java

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(1000);
        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(1000);

        conta.sacar(100);
        conta.sacar(100, 10);

        cc.sacar(100);
```
