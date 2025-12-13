package day7.loose_coupling;

public class BodybuildingCoach  implements SportCoach{

	@Override
	public void giveDiet() {

		System.out.println("For Leaning Use High Protein Diet");
	}

	@Override
	public void giveSchedule() {
		System.out.println("Take Rest and Do workout once in a Day");
	}

}
