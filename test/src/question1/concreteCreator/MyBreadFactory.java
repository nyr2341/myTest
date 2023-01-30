package question1.concreteCreator;

import question1.concreteProduct.Butter;
import question1.concreteProduct.Cream;
import question1.concreteProduct.Sugar;
import question1.creater.BreadFactory;
import question1.product.Bread;

public class MyBreadFactory extends BreadFactory {

	@Override
	public Bread createBread(String name) {
		Bread bread = null;
		
		if ( "butter".equals(name) ) {
			bread = new Butter();
		} else if( "cream".equals(name) ) {
			bread =  new Cream();
		} else if( "sugar".equals(name) ) {
			bread =  new Sugar();
		}
		
		return bread;
	}

}
