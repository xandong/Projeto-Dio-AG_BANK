public class Main{
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Alexandre");
        c1.setSobrenome("Gurgel");

        Conta cCorrente = new ContaCorrente(c1);
        Conta cPoupanca = new ContaPoupanca(c1);

        cCorrente.depositar(1000);
        cCorrente.transferir(cPoupanca, 459.92);
        cPoupanca.depositar(1000);

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();
    }
}