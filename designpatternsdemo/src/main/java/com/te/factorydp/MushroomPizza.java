package com.te.factorydp;

public class MushroomPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing mushroom pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking mushroom pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting mushroom pizza");
	}

}
