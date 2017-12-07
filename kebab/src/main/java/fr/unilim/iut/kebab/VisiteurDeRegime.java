package fr.unilim.iut.kebab;

import fr.unilim.iut.kebab.ingredients.*;

public interface VisiteurDeRegime {
	boolean visit(Agneau a);
	boolean visit(Boeuf a);
	boolean visit(Crevette a);
	boolean visit(Fromage a);
	boolean visit(Oignon a);
	boolean visit(Pain a);
	boolean visit(Salade a);
	boolean visit(Sauce a);
	boolean visit(Thon a);
	boolean visit(Tomate a);
	boolean visit(Assiette a);
}
