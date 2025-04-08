public interface IConta {

    //na Interface não e nescessario ultilizar "public" pois todos os metodos estarão publicos
    //para utilizar esses metodos deve-se usar o "implements" na classe desejavel, e implementar os metodos.

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    //corpo para receber valor
    void receber(double valor, Conta contaOrigem);

    void imprimirExtrato();
}
