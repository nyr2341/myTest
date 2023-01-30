package question1.product;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public abstract class Bread {
	public String breadType;
	public LinkedHashMap<String, Object> recipe = new LinkedHashMap<String, Object>();
	
	public void out() {
		System.out.println("breadType: " + breadType);
		System.out.println("recipe");
		
		for( Entry<String, Object> item : recipe.entrySet() ) {
			System.out.println(item.getKey()+": "+item.getValue());
		}
		System.out.println();
	}
}
