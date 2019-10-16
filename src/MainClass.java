package CalculRPN;

public class MainClass {

	public static void main(String[] args) {
		CalculatriceRPN c = new CalculatriceRPN();
		try {
			c.calcul();
		} catch (RPNException e) {
			e.printStackTrace();
		}
	}
}
