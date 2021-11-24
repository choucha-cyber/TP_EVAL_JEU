package EVAL_JEU_VIDEO;

import java.util.ArrayList;
import java.util.Random;

public class Joueur {

	// properties
	private String nom;
	private int sante;
	private int force;
	private int experience;
	public Arme arme;
	
	private Joueur player1;
	int lifePlayer1 = this.sante * this.force * this.experience;
	private Joueur player2;
	int lifePlayer2 = player2.getSante() * player2.getForce() * player2.getExperience();
	private int setExperience;
	


	// construct
	public Joueur(String nom, int sante, int force, int experience, Arme arme) {
		force(10, 5);
		this.nom = nom;
		this.sante = sante;
		this.force = force;
		this.experience = experience;
		this.arme = arme;
		
	}
	
	public Joueur() {
		//super();
		// TODO Auto-generated constructor stub
	}

	// methods


	public int force(int max, int min) {
		// force random between 5->10
		return (int) (Math.floor(Math.random() * (10 - 5 + 1)) + 5);

	}
	
	//getters/setters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void init_game() {
		experience = 1;
		sante = 10;
	}

	public void desarmer() {
		this.arme = null;
	}

	public Random changeArme(Arme arme_type) {
	
		//random for switch colt
		String[] strArr = { "EPEE", "COUTEAU", "MASSE", "PISTOLET", "ARC"};
	      Random rand = new Random();
	      int res = rand.nextInt(strArr.length);
	      System.out.println("nouvelle arme joueur est " + strArr[res]);
		return rand;
	
		}
		
		

	public void attaque(Joueur player) {
		//init_game

		Joueur player1 = null;
		Joueur player2 = null;
		
		
		int lifePlayer2 = player2.getSante() * player2.getForce() * player2.getExperience();
		if (lifePlayer1 > lifePlayer2) {
			player1.force += 1;
			player2.sante -= 1;
			this.experience += 1;
			player2.setExperience += 1; 
		}
		
		if(lifePlayer2 > lifePlayer1){
			player2.force += 1;
			player1.sante -= 1;
			player2.experience += 1;
			this.experience += 1; 
		}
		
		afficherResult();
	}
	
	//fonction pour afficher les result apres chaque round
	
	public void afficherResult()
	{
		int lifePlayer2 = 0;
		if( lifePlayer1 > lifePlayer2  )
	    {
	        String player1 = null;
			System.out.println(player1 + "a obtenu le score :" + lifePlayer1);
	        String player2 = null;
			System.out.println(player2 + "a obtenu le score :" + lifePlayer2);
	        
	        
	    }
	}

	public void finalResult() {
		
		int lifePlayer2 = 0;
		String player1 = null;
		String player2 = null;
		if(lifePlayer1 > lifePlayer2) {
		System.out.println("le vainqueur est :" + player1);
		System.out.println("le vaicu est :" + player2);
		}
		if(lifePlayer2> lifePlayer1) {
			System.out.println("le vainqueur est :" + player2);
			System.out.println("le vaicu est :" + player1);
		}
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", sante=" + sante + ", force=" + force + ", experience=" + experience + ", arme="
				+ arme + "]";
	}

}
