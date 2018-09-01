package com.techlabs.duck.test;

import com.techlabs.duck.Duck;
import com.techlabs.duck.FlyRocket;
import com.techlabs.duck.MallordDuck;
import com.techlabs.duck.ModelDuck;

public class DuckTest {

	public static void main(String[] args) {
		Duck mallardDuck = new MallordDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocket());
		model.performFly();
	}
}
