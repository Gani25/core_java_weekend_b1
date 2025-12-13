package day7.loose_coupling;

public class CricketCoach implements SportCoach {

	@Override
	public void giveDiet() {

		System.out.println("Eat Moderate Diet fill with Fibres");
	}

	@Override
	public void giveSchedule() {
		// TODO Auto-generated method stub
		System.out.println("Play in pitch 3 time daily");
		
	}
	
	

}
