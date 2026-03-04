package study.LLD.udemy.oops.structural.decorator;

public class WithDecoratorPattern {
	public static void main(String[] args) {
		Pizza pizza = new BasicPizzaV2();
		System.out.println("Description : " + pizza.getDescription());

		pizza = new MushroomPizzaDecorator(pizza);
		System.out.println("Description : " + pizza.getDescription());

		pizza = new CheesePizzaDecorator(pizza);
		System.out.println("Description : " + pizza.getDescription());
	}
}

class BasicPizzaV2 implements Pizza {

	@Override
	public String getDescription() {
		return "Basic pizza";
	}

	@Override
	public double getCost() {
		return 100.0;
	}

}

abstract class PizzaDecorator implements Pizza {

	protected Pizza decoratedPizza;

	public PizzaDecorator(Pizza pizza) {
		this.decoratedPizza = pizza;
	}

	@Override
	public String getDescription() {
		return decoratedPizza.getDescription();
	}

	@Override
	public double getCost() {
		return decoratedPizza.getCost();
	}
}

class CheesePizzaDecorator extends PizzaDecorator {

	public CheesePizzaDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return decoratedPizza.getDescription() + ", cheese";
	}

	@Override
	public double getCost() {
		return decoratedPizza.getCost() + 50.0;
	}
}

class MushroomPizzaDecorator extends PizzaDecorator {

	public MushroomPizzaDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return decoratedPizza.getDescription() + ", mushroom";
	}

	@Override
	public double getCost() {
		return decoratedPizza.getCost() + 30.0;
	}
}