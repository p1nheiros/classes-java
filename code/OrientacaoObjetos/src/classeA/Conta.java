package classeA;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private float saldo;
    private String tipoConta;

    public Conta() {
    }

    public Conta(int numeroConta, String nomeTitular, float saldo, String tipoConta) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public Conta(float saldo) {
        this.saldo = saldo;
    }

    public float sacar(float valor) {
        if (saldo >= valor) {
            System.out.println("Saque efetuado com sucesso!");
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente!");
            return 0.0f;
        }

    }

    // metodo depositar

    public void depositar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
        } else {
            this.saldo += valor;
            //this.saldo = this.saldo + x;
        }
    }

    // metodo imprimir nome
    public void imprimirNomeConta() {
        System.out.println("O nome do titular da conta é: " + this.nomeTitular);

    }

    public String imprimirNomeContaRetorno() {
        return "O nome do titular da conta é: " + this.nomeTitular;
    }

    // metodo imprimir saldo
    public void imprimirSaldo() {
        System.out.println("O saldo da conta cujo titular é " + this.nomeTitular + " é igual a:" + this.saldo);
    }

    //metodo de transferência
    public void transferir(float valor, Conta contaDestino) {
        if(valor <= 0 || valor > this.saldo) {
            System.out.println("Valor insuficiente para transferência.");
        } else {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Valor transferido da conta com titular: " + this.nomeTitular +" com sucesso para o titular: " + contaDestino.nomeTitular);
        }
    }

    public void tipoDaConta() {
        System.out.println("O tipo da conta é: " + this.tipoConta);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }


}