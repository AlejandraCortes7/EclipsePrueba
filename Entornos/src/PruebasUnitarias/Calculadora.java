package PruebasUnitarias;

public class Calculadora {
	public static int resp;
	public Calculadora()
	{
		resp = 0;
	}

	public static int sumar (int n1, int n2){
		resp = n1 + n2;
		return resp;
	}
	public static int restar ( int n1, int n2) {
		resp = n1 - n2;
		return resp;
	}
	public int sumar(int c)//acumulativo
	{
		resp += c;
		return resp;
	}
	public int restar(int c)//acumulativo
	{
		resp += c;
		return resp;
	}
	public int resp() {
		return resp;
	}
	public void clear () {
		resp = 0;
	}
	public int dividir (int a, int b) {
		if(b==0)
			throw new ArithmeticException("No puedes dividir por cero");
		resp = a/b;
		return resp;
		
	}
	public void operacionOptima() {
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e ) {
			e.printStackTrace();
	}
	}
}
