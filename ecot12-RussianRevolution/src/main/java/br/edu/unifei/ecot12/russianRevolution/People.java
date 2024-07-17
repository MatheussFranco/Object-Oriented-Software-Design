package br.edu.unifei.ecot12.russianRevolution;

public class People {
	private String name;
	private int forces;
	private Battle battle;
	
	protected void callAttack() {
		battle.attack();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getForces() {
		return forces;
	}

	public void setForces(int forces) {
		this.forces = forces;
	}
	
	
}
