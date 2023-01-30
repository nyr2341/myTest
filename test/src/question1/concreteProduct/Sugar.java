package question1.concreteProduct;

import question1.product.Bread;

public class Sugar extends Bread {
	public Sugar() {
		breadType = "sugar";
		recipe.put("flour", 100);
		recipe.put("water", 50);
		recipe.put("sugar", 200);
	}
}