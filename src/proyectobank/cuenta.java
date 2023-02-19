package proyectobank;

public class cuenta {

	private double saldo;
	private int agencia;
	private int numero;
	private cliente titular;

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
		} else {
			return false;
		}
	}
	/// encapsulamiento de saldo
	public double getSaldo() {
		return saldo;
	}

	// public void setSaldo(double saldo) {
	// 	this.saldo = saldo;
	// }
	/// encapsulamiento de agencia 
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}

	}
/// encapsulamiento de numero 
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	/// encapsulamiento de titular
	public cliente getTitular() {
		return titular;
	}

	public void setTitular(cliente titular) {
		this.titular = titular;
	}
	

}
