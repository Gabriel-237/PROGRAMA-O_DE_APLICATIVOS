# Sistema de Pessoa em Java

```java
// Pessoa.java
public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ".");
    }

    // Sobrecarga
    public void apresentar(String mensagem) {
        System.out.println(mensagem + " Meu nome é " + nome + ".");
    }
}
```

```java
// Aluno.java
public class Aluno extends Pessoa {

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o aluno " + nome + ".");
    }

    @Override
    public void apresentar(String mensagem) {
        System.out.println(mensagem + " Eu sou o aluno " + nome + ".");
    }
}
```

```java
// Professor.java
public class Professor extends Pessoa {

    public Professor(String nome) {
        super(nome);
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, eu sou o professor " + nome + ".");
    }

    @Override
    public void apresentar(String mensagem) {
        System.out.println(mensagem + " Eu sou o professor " + nome + ".");
    }
}
```

```java
// Main.java
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos");
        Aluno aluno = new Aluno("Ana");
        Professor professor = new Professor("Marcos");

        pessoa.apresentar();
        pessoa.apresentar("Prazer em conhecer você!");

        aluno.apresentar();
        aluno.apresentar("Oi turma!");

        professor.apresentar();
        professor.apresentar("Bom dia, alunos!");
    }
}
```

## Saída esperada

```java
Olá, meu nome é Carlos.
Prazer em conhecer você! Meu nome é Carlos.
Olá, eu sou o aluno Ana.
Oi turma! Eu sou o aluno Ana.
Olá, eu sou o professor Marcos.
Bom dia, alunos! Eu sou o professor Marcos.
```
