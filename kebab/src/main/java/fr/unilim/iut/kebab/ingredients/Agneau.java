package fr.unilim.iut.kebab.ingredients;


import fr.unilim.iut.kebab.Kebab;
import fr.unilim.iut.kebab.VisiteurDeRegime;

public class Agneau extends Ingredient {

    public Agneau(String nom, Kebab kebab) {
        super(nom,kebab);
    }
    
    @Override
    public boolean accept(VisiteurDeRegime visiteur) {
    	return visiteur.visit(this);
    }
    
}
