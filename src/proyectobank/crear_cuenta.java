package proyectobank;

public class crear_cuenta {

	public static void main(String[] args) {
		// variable          = valor 
		cuenta primeracuenta = new cuenta();
		primeracuenta.saldo = 1000;
		primeracuenta.titular = "luis";
		System.out.println(primeracuenta.saldo + primeracuenta.titular);
		
		cuenta segundacuenta = new cuenta();
		segundacuenta.saldo =2500;
		System.out.println(segundacuenta.saldo);
  
	}

}
