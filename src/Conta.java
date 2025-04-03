public abstract class Conta implements IConta{

    //a "class Conta" é a classe pai de "ContaCorrente e ContaPoupanca"

    //metodos privados para exibir "agencia, numero, saldo"
    private int agencia;
    private int numero;
    private double saldo;

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
