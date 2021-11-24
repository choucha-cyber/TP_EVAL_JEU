package EVAL_JEU_VIDEO;

public class Arme {
	//properties
	public String arme_nom;
	public enum arme_type {EPEE, COUTEAU, MASSE, PISTOLET, ARC} ; 
	public int puissance;
	
	@Override
	public String toString() {
		return "Arme [arme_nom=" + arme_nom + ", puissance=" + puissance + "]";
	}

}