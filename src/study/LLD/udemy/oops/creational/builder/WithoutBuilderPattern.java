package study.LLD.udemy.oops.creational.builder;

//Problem: We need to initialize a objects containing multiple values without making the constructor too much attributes
public class WithoutBuilderPattern {
	public static void main(String[] args) {
		House house = new House("Concrete", "3", "1000", false, false, true); // here the optional constructor are also added , we need to remove that
		System.out.println(house);
	}
}

class House {
	private String material;
	private String floorCount;
	private String areaInSqft;
	private boolean hasSwimmingPool;
	private boolean hasGym;
	private boolean hasGarage;

	public House(String material, String floorCount, String areaInSqft, boolean hasSwimmingPool, boolean hasGym,
			boolean hasGarage) {
		super();
		this.material = material;
		this.floorCount = floorCount;
		this.areaInSqft = areaInSqft;
		this.hasSwimmingPool = hasSwimmingPool;
		this.hasGym = hasGym;
		this.hasGarage = hasGarage;
	}

	@Override
	public String toString() {
		return "House [material=" + material + ", floorCount=" + floorCount + ", areaInSqft=" + areaInSqft
				+ ", hasSwimmingPool=" + hasSwimmingPool + ", hasGym=" + hasGym + ", hasGarage=" + hasGarage + "]";
	}

}