package fr.dauphine.facquetKarim.monProjetAgile;

import java.util.ArrayList;

public class Pays {
	static Pays defautPays = new Pays(100000, "DefautLangue", new Ville(true));

    // instance variables - replace the example below with your own
    private int nbr_habitants;
    private final String langue;
    private final Ville capitale;
    private ArrayList<Pays> frontaliers;
    

    /**
     * Constructor for objects of class pays
     */
    public Pays(int nbr_habitants, String langue, Ville capitale)
    {
        this.nbr_habitants=nbr_habitants;
        this.langue=langue;
        this.capitale=capitale;// initialise instance variables
        this.frontaliers = new ArrayList<Pays>();
    }
    
    public int getNhabitants(){
        return this.nbr_habitants;

    }
    public String getLangue(){
        return this.langue;

    }
    public Ville getCapitale(){
        return this.capitale;

    }
    public void setNbhabitants(int n){
        this.nbr_habitants = n;
    }
    
    public void addFrontalier(Pays p) {
    	if (this.equals(p)==false) {
    		this.frontaliers.add(p);
    		if (p.isFrontalier(this) == false){
        		p.frontaliers.add(this);
        	}	
    	}
    	
    }
    
    public boolean isFrontalier(Pays p) {
    	return this.frontaliers.contains(p);
    }
    
    public int nbVoisins() {
    	return this.frontaliers.size();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int maj_nbr_habitants(int nv_nes)
    {
        // put your code here
        return this.nbr_habitants + nv_nes;
    }
}

