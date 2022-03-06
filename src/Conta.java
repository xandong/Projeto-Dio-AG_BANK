public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static final int SALDO_PADRAO = 0;
    private static int SEQUENCIAL = 1000;

    
    protected int agencia;
    protected int numConta;
    protected double saldo;
    private Cliente cliente;

 
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numConta = ++SEQUENCIAL;
        this.saldo = SALDO_PADRAO;
        this.cliente = cliente;
    }
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    @Override
    public void transferir(Conta cDestino, double valor) {
        this.sacar(valor);
        cDestino.depositar(valor);
    }
    protected void imprimeExtrato() {
        System.out.println(String.format("Titular: %s %s.", cliente.getNome(), cliente.getSobrenome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número da conta: %d", this.numConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));    
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumConta() {
        return numConta;
    }
    public double getSaldo() {
        return saldo;
    }

}