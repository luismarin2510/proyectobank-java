package proyectobank;

public class crear_cuenta {

	public static void main(String[] args) {
		cuenta primeracuenta = new cuenta();
		primeracuenta.saldo = 1000;
		primeracuenta.titular = "luis";
		System.out.println(primeracuenta.saldo + primeracuenta.titular);

	}

}
