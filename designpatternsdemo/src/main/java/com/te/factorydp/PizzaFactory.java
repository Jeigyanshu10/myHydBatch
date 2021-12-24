package com.te.factorydp;

public class PizzaFactory {

	public Pizza getPizza(String pizzaType) {
		Pizza p = null;
		if (pizzaType.equals("Chicken")) {
			p = new ChickenPizza();
		} else if (pizzaType.equals("Cheese")) {
			p = new CheesePizza();
		} else if (pizzaType.equals("Mushroom")) {
			p = new MushroomPizza();
		}
		return p;
	}

}
