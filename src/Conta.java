public abstract class Conta implements IConta{

    //a "class Conta" é a classe pai de "ContaCorrente e ContaPoupanca"
    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    //metodos privados para exibir "agencia, numero, saldo"
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(int valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

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


}
