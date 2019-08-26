package intermediate;

public class PlaneFlyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaneFly jamboJet = new PlaneFly();
		PlaneFly skyView = new PlaneFly();
		jamboJet.setMake2("Jambojet");
        skyView.setTopSpeed2(640);	
        System.out.println(jamboJet.getSpeed2());
        /*
        PlaneFly jamboJet = new PlaneFly();
		PlaneFly skyView = new PlaneFly();
		jamboJet.setMake2("JamboJet");
        skyView.setTopSpeed2(640);	
        System.out.println(jamboJet.getSpeed2());
        */
	}

}
