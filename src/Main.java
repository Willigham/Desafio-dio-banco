public class Main {
    public static void main(String[] args){
        Cliente will = new Cliente();
        will.setNome("Will");


        Conta cc = new ContaCorrente(will);
        Conta poupanca = new ContaPoupanca(will);

        cc.depositar(100);
         //metodo receber
        poupanca.receber(100, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
