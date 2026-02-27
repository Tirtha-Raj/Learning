package study.LLD.udemy.oops.creational.builder;

public class WithBuilderPattern {

	public static void main(String[] args) {
		HouseV2 house = new HouseV2.HouseBuilder("Concrete", "3", "1000")
										.setHasGarage(true)
										.setHasGym(true)
										.build();
		System.out.println(house);
	}
}

class HouseV2 {
	private String material;
	private String floorCount;
	private String areaInSqft;
	private boolean hasSwimmingPool;
	private boolean hasGym;
	private boolean hasGarage;

	public HouseV2(HouseBuilder builder) {
		this.material = builder.material;
		this.floorCount = builder.floorCount;
		this.areaInSqft = builder.areaInSqft;
		this.hasSwimmingPool = builder.hasSwimmingPool;
		this.hasGym = builder.hasGym;
		this.hasGarage = builder.hasGarage;
	}

	@Override
	public String toString() {
		return "House [material=" + material + ", floorCount=" + floorCount + ", areaInSqft=" + areaInSqft
				+ ", hasSwimmingPool=" + hasSwimmingPool + ", hasGym=" + hasGym + ", hasGarage=" + hasGarage + "]";
	}

	static class HouseBuilder {
		private String material;
		private String floorCount;
		private String areaInSqft;
		private boolean hasSwimmingPool;
		private boolean hasGym;
		private boolean hasGarage;

		public HouseBuilder(String material, String floorCount, String areaInSqft) {
			this.material = material;
			this.floorCount = floorCount;
			this.areaInSqft = areaInSqft;
		}

		public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
			this.hasSwimmingPool = hasSwimmingPool;
			return this;
		}

		public HouseBuilder setHasGym(boolean hasGym) {
			this.hasGym = hasGym;
			return this;
		}

		public HouseBuilder setHasGarage(boolean hasGarage) {
			this.hasGarage = hasGarage;
			return this;
		}

		public HouseV2 build() {
			return new HouseV2(this);
		}

	}

}