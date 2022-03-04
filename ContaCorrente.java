public class ContaCorrente  extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public double imprimirExtrato() {
        System.pout.println("----- Extrato Conta Corrente ------");
        super.imprimirInfosComuns();
    }
}
