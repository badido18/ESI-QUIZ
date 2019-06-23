abstract class Compte{
	
	//Constructeur

	Compte(){
		defineloginDefault();
		defineMotDePasseDefault();
	}


	//Attribus

	private int id;
	private String nom;
	private String preNom;
	private String dateNaissance;
	private String adresse;
	private String login;
	private String motDePasse;
	
	//methodes
	
	private void defineloginDefault(){
		login[0]=preNom[0];
		login[1]=' ';
		login=login.concat(nom)
	}
	private void defineMotDePasseDefault(){
		motDePasse=nom.concat(dateNaissance)
	}


}