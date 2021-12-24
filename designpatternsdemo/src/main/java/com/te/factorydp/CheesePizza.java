package com.te.factorydp;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing cheeze pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking cheeze pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting cheeze pizza");
	}

}
