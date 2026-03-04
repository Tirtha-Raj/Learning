package study.LLD.udemy.oops.structural.decorator;

//We need to create a pizza app where need to modify the topings at run time in the client
public class WithoutDecoratorPattern {
	public static void main(String[] args) {
		Pizza pizza = new MushroomCheesePizza();
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
		
		//supppose we need only Mushroom pizza then we have to again write the same implementation for this
	}
}

interface Pizza {
	public String getDescription();

	public double getCost();
}

class BasicPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Description : Basic pizza";
	}

	@Override
	public double getCost() {
		return 100.0;
	}

}

class CheesePizza extends BasicPizza {
	@Override
	public String getDescription() {
		return super.getDescription() + ", cheese";
	}

	@Override
	public double getCost() {
		return super.getCost() + 50.0;
	}
}

class MushroomCheesePizza extends CheesePizza {
	@Override
	public String getDescription() {
		return super.getDescription() + ", mushroom";
	}

	@Override
	public double getCost() {
		return super.getCost() + 80.0;
	}
}

class OliveCheesePizza extends CheesePizza {
	@Override
	public String getDescription() {
		return super.getDescription() + ", olive";
	}

	@Override
	public double getCost() {
		return super.getCost() + 50.0;
	}
}