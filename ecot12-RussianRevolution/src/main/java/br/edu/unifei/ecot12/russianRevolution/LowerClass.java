package br.edu.unifei.ecot12.russianRevolution;

public abstract class LowerClass extends People {
	private int peopleMorality;
	private float taxesPercentage;
	
	public void labourApplication() {}

	public int getPeopleMorality() {
		return peopleMorality;
	}

	public void setPeopleMorality(int peopleMorality) {
		this.peopleMorality = peopleMorality;
	}

	public float getTaxesPercentage() {
		return taxesPercentage;
	}

	public void setTaxesPercentage(float taxesPercentage) {
		this.taxesPercentage = taxesPercentage;
	};
	
	
}
