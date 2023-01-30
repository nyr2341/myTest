package question1.concreteProduct;

import question1.product.Bread;

public class Cream extends Bread {
	public Cream() {
		breadType = "cream";
		recipe.put("flour", 100);
		recipe.put("water", 100);
		recipe.put("cream", 200);
	}
}