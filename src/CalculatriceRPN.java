package CalculRPN;

public class CalculatriceRPN {
	private MoteurRPN moteur;
	private SaisieRPN saisie;
	
	public CalculatriceRPN() {
		MoteurRPN.MIN_VALUE = 0;
		MoteurRPN.MAX_VALUE = 31000;
		moteur = new MoteurRPN();
		saisie = new SaisieRPN();
	}
	
	public double calcul() throws RPNException {
		saisie.input(moteur);
		if(moteur.getOperandes().size() != 1) throw new RPNException(moteur.getOperandes().size());
		return moteur.getOperandes().pop();
	}
}
