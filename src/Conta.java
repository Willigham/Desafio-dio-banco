public abstract class Conta implements IConta{

    //a "class Conta" é a classe pai de "ContaCorrente e ContaPoupanca"
    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    //metodos privados para exibir "agencia, numero, saldo"
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta( Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    //metodo para receber
    @Override
    public void receber(double valor, Conta contaOrigem) {
        this.depositar(valor);
        contaOrigem.sacar(valor);
    }

    //get usado para exibir oque está no metodo privado
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


}
