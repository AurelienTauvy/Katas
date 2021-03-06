package fr.unilim.iut.kebab;

import java.util.List;
import fr.unilim.iut.kebab.ingredients.Ingredient;

public abstract class Kebab {
	public abstract List<Ingredient> getIngredients();
	boolean isVegetarien() {
		VisiteurRegimeVegetarien visiteur = new VisiteurRegimeVegetarien();
		for(Ingredient ingredient : this.getIngredients()) {
			if(!ingredient.accept(visiteur)) {
				return false;
			}
		}
		return true;
	}
	public boolean isPescetarien() {
		VisiteurRegimePescetarien visiteur = new VisiteurRegimePescetarien();
		for(Ingredient ingredient : this.getIngredients()) {
			if(!ingredient.accept(visiteur)) {
				return false;
			}
		}
		return true;
	}
}
