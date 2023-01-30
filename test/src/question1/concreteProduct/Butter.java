package question1.concreteProduct;

import question1.product.Bread;

public class Butter extends Bread {
	public Butter() {
		breadType = "butter";
		recipe.put("flour", 100);
		recipe.put("water", 100);
		recipe.put("butter", 50);
	}
}