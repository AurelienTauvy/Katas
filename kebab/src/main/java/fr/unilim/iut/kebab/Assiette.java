package fr.unilim.iut.kebab;

import java.util.LinkedList;
import java.util.List;

import fr.unilim.iut.kebab.ingredients.Ingredient;

public class Assiette extends Kebab {

	public List<Ingredient> getIngredients() {
		return new LinkedList<>();
	}

	public boolean isPescetarien() {
		return true;
	}
	
	@Override
	public boolean accept(VisiteurDeRegime visiteur) {
		return visiteur.visit(this);
	}

}
