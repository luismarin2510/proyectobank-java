package proyectobank;

public class crear_cuenta {

	public static void main(String[] args) {
		// variable = valor
		cuenta primeracuenta = new cuenta();
		primeracuenta.setSaldo(1500);
		System.out.println(primeracuenta.getSaldo() + "luis");

		cuenta segundacuenta = new cuenta();
		segundacuenta.setSaldo(2500);
		System.out.println(segundacuenta.getSaldo());

	}

}
