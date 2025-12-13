package day7.loose_coupling;

public class GymMain {
	
	public static void main(String[] args) {
		
		System.out.println("Loose Coupling");
		SportCoach coach = new BodybuildingCoach();
		
		coach.giveDiet();
		coach.giveSchedule();
		
		System.out.println("-------------------------------------------");
		coach = new CricketCoach();
		coach.giveDiet();
		coach.giveSchedule();
		
		
	}

}
