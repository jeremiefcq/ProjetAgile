package fr.dauphine.facquetKarim.monProjetAgile;

public class Ville {
	 // isCaptale indique si la ville est une capitale
    private final boolean isCapitale ;
    private final Pays paysOrigine;

    /**
     * Constructor for objects of class ville
     */
    public Ville(boolean b)
    {   // initialise instance variables
        this.isCapitale=b;
        this.paysOrigine = Pays.defautPays;
    }

    public boolean getCapitale(){
        return this.isCapitale;
    }
    
    // is_Capitale_de_Pays indique si cette ville est la capitale du pays p
    public boolean estCapitaleDe(Pays p){
        return nouvelleMethodeCapitale(p);
    }

	protected boolean nouvelleMethodeCapitale(Pays p) {
		return p.getCapitale()==this;
	}
}
