package question1;

import java.util.ArrayList;
import java.util.List;

import question1.concreteCreator.MyBreadFactory;
import question1.creater.BreadFactory;
import question1.product.Bread;

public class FactoryMethod {

	public static void main(String[] args) {
		BreadFactory breadFactory = new MyBreadFactory();
		Bread butter = breadFactory.createBread("butter");
		Bread cream = breadFactory.createBread("cream");
		Bread sugar = breadFactory.createBread("sugar");
		
		List<Bread> breadList = new ArrayList<Bread>();
		breadList.add(cream);
		breadList.add(sugar);
		breadList.add(butter);
		
		for( Bread bread : breadList ) {
			bread.out();
		}
	}

}