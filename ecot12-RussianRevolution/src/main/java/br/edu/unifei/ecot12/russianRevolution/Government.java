package br.edu.unifei.ecot12.russianRevolution;

public class Government {
	public static Government single = new Government();
	private String ruler;
	
	private void Government() {}
	
	public Government getGovernment() {
		return single;
	}
	
	private void setRuler(String gov) {
		this.ruler = gov;
	}
	
}
