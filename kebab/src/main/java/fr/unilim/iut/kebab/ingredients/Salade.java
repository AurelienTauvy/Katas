package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import fr.unilim.iut.kebab.VisiteurDeRegime;

public class Salade extends Ingredient {

	public Salade(String nom, Kebab kebab) {
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
