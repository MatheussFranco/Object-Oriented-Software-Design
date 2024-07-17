package br.edu.unifei.ecot12.russianRevolution;

public abstract class Encounter implements Battle {

	@Override
	public void attack() {
		if(lowerClass.forces > upperClass.forces) {
			lowerClass.peopleMorality +=1;
			upperClass.nobilityInfluentia-=1;
		}
		if(lowerClass.forces > upperClass.forces) {
			lowerClass.peopleMorality -=1;
			upperClass.nobilityInfluentia+=1;
		}
		else {
			gov.setRuler("caos");
		}

	}

}
