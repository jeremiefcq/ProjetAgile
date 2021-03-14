package fr.dauphine.facquetKarim.monProjetAgile.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fr.dauphine.facquetKarim.monProjetAgile.Pays;
import fr.dauphine.facquetKarim.monProjetAgile.Ville;
import junit.framework.Assert;

public class stepDefFrontieres {
	private Ville Paris = new Ville(true);
	private Pays france = new Pays(65000000,"Francais", Paris);
	private Ville madrid = new Ville(true);
	private Pays espagne = new Pays(85000000,"Espanol", madrid);
	
	@Given("la creation d'un Pays")
	public void la_creation_d_un_Pays() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(this.france != null);
	}

	@Given("sa liste de pays frontaliers initialisee vide")
	public void sa_liste_de_pays_frontaliers_initialisee_vide() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(this.france.nbVoisins() == 0);
	}

	@When("l'utilisateur lui ajoute un pays frontalier")
	public void l_utilisateur_lui_ajoute_un_pays_frontalier() {
	    // Write code here that turns the phrase above into concrete actions
	    france.addFrontalier(espagne);
	}

	@Then("Les deux pays ont l'autre pays ajoute leur liste de pays frontaliers")
	public void les_deux_pays_ont_l_autre_pays_ajoute_leur_liste_de_pays_frontaliers() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(france.isFrontalier(espagne) == true && espagne.isFrontalier(france));
	}


	@When("l{string}ajoute en tant que son propre pays frontalier")
	public void l_ajoute_en_tant_que_son_propre_pays_frontalier(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    france.addFrontalier(france);
	}

	@Then("la liste des pays frontaliers du pays reste vide")
	public void la_liste_des_pays_frontaliers_du_pays_reste_vide() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(france.isFrontalier(france) == false);
	}
}
