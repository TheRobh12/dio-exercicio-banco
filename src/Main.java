public class Main {

    public static void main(String[] args) {
        Cliente robson = new Cliente();
        robson.setNome("Robson");

        Conta corrente = new ContaCorrente(robson);
        Conta poupanca = new ContaPoupanca(robson);

        corrente.depositar(100);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}