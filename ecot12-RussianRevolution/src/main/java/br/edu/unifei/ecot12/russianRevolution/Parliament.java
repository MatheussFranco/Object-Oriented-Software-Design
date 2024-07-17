package br.edu.unifei.ecot12.russianRevolution;

public class Parliament {
	private String name;
	private int numberParties;
	
	public boolean voteLaws() {
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberParties() {
		return numberParties;
	}

	public void setNumberParties(int numberParties) {
		this.numberParties = numberParties;
	};
	
	
}
