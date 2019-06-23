import java.util.*;

class ESIQuiz{

	//Attribus

	private Formateur[] tabFomrateurs;
	private Formateur formateurConnecte;
	private Apprenant apprenantConnecte;  
	private static Scanner sc = new Scanner(System.in);

	//Methodes

	private void seConecterFormateur(String username,String password){

	}
	private void seConneterApprenant(String username,String password){

	}
	private void seDeconnecter(){

	}
	private Quiz generationCopieReponse(Quiz quiz){
		quiz= new Quiz();
		return quiz ;
	}
	private void evaluationAuto(Quiz quizTermine){

	}
	private void afficherResultat(Apprenant apprenant){

	}
	private void creerCompteFormateur(){
		tabFomrateurs[0]= new Formateur();

	}
	private void menuPrincipale(){

		int option; 

		System.out.println("***Menu Beta test***");
		System.out.println("ceci sont des choses a faire");
		System.out.println("1-creer compte fomrateur");
		System.out.println("2-creer formation");
		System.out.println("3-menu gestion d'apprenant (3 ou 4)");
		System.out.println("4-Creer Notions/question/Quiz");
		System.out.println("5-tester le quiz avec un apprenant a 100%");
		System.out.println("6-Consulter activite apprenant");
		System.out.println("7-affichier le classement ");
		System.out.println("0-Quitter");

		option = sc.nextInt();
		switch(option)
		{
			case 1 :  creerCompteFormateur(); break;
			case 2 : break;
			case 3 : break;
			case 0 : break; //exit
			default : break;
		}
	}

}