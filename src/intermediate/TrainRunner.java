package intermediate;

public class TrainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  
		int i = 1;
		System.out.println(i++);
		System.out.println(i);
		
		int j = 1;
		System.out.println(++j);
		System.out.println(j);*/
		
	
		Train ksm = new Train();
		ksm.setTopSpeed(640);
        ksm.setYear(1942);
        ksm.setMake("German");
        ksm.setModel("GY");
        ksm.accelelate();
        System.out.println(ksm.getSpeed());
        ksm.accelelate();
        System.out.println(ksm.getSpeed());
        ksm.accelelate();
        System.out.println(ksm.getSpeed());
        
        //ksm.setTime(dis);
        
        
        
        System.out.println("The train is now decelerating");
      
        
        ksm.deccelelate();
        System.out.println(ksm.getSpeed());
        ksm.deccelelate();
        System.out.println(ksm.getSpeed());
        ksm.deccelelate();
        System.out.println(ksm.getSpeed());
        
        System.out.println("Other Train Properties");
        
        ksm.getYear();
        System.out.println(ksm.getYear());
        System.out.println(ksm.getMake());
        System.out.println(ksm.getModel());
	}

}

