package com.te.factorydp;

public class PizzaStore {
	public void orderPizza(String type) {
		PizzaFactory factory = new PizzaFactory();
		Pizza p = factory.getPizza(type);
		p.prepare();
		p.bake();
		p.cut();

	}

}
