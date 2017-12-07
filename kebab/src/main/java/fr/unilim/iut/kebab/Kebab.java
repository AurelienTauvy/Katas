package fr.unilim.iut.kebab;

import java.util.List;
import fr.unilim.iut.kebab.ingredients.Ingredient;

public abstract class Kebab {
	public abstract List<Ingredient> getIngredients();
	boolean isVegetarien() {
		VisiteurRegimeVegetarien visiteur = new VisiteurRegimeVegetarien();
		for(Ingredient ingredient : this.getIngredients()) {
			if(ingredient.accept(visiteur)==false) {
				return false;
			}
		}
		return true;
	}
	public abstract boolean isPescetarien();
	public abstract boolean accept(VisiteurDeRegime visiteur);
}
