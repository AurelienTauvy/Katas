package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import fr.unilim.iut.kebab.VisiteurDeRegime;

public class Fromage extends Ingredient {

	public Fromage(String nom, Kebab kebab) {
		super(nom, kebab);
	}

	@Override
	public boolean isPescetarien() {
		return super.isPescetarien();
	}

	@Override
	public boolean accept(VisiteurDeRegime visiteur) {
		return visiteur.visit(this);
	}

}
