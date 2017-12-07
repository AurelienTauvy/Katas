package fr.unilim.iut.kebab;

import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Boeuf;
import fr.unilim.iut.kebab.ingredients.Crevette;
import fr.unilim.iut.kebab.ingredients.Fromage;
import fr.unilim.iut.kebab.ingredients.Oignon;
import fr.unilim.iut.kebab.ingredients.Pain;
import fr.unilim.iut.kebab.ingredients.Salade;
import fr.unilim.iut.kebab.ingredients.Sauce;
import fr.unilim.iut.kebab.ingredients.Thon;
import fr.unilim.iut.kebab.ingredients.Tomate;

public class VisiteurRegimeVegetarien implements VisiteurDeRegime {

	@Override
	public boolean visit(Agneau a) {
		return false;
	}

	@Override
	public boolean visit(Boeuf a) {
		return false;
	}

	@Override
	public boolean visit(Crevette a) {
		return false;
	}

	@Override
	public boolean visit(Fromage a) {
		return true;
	}

	@Override
	public boolean visit(Oignon a) {
		return true;
	}

	@Override
	public boolean visit(Pain a) {
		return true;
	}

	@Override
	public boolean visit(Salade a) {
		return true;
	}

	@Override
	public boolean visit(Sauce a) {
		return true;
	}

	@Override
	public boolean visit(Thon a) {
		return false;
	}

	@Override
	public boolean visit(Tomate a) {
		return true;
	}

}
