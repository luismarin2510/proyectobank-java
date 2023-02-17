package proyectobank;

public class cuenta {

	double saldo;
	int agencia;
	int numero;
	String titular;

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir(double valor, cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		}else {
			return false;
		}
	}

}
