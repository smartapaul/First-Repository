package polymo;

public class Supreme_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bank_base Equity = new Equity();
		bank_base Family = new Family();
		bank_base Nic = new Nic();
		
		int annum ;
		
		System.out.println(Equity.getInterestRates()*2500);
		System.out.println(Family.getInterestRates());
		System.out.println(Nic.getInterestRates());
		
		annum = Equity.getInterestRates() / 50000;
		
		System.out.println("The annual interest is" + annum );
	}

}
