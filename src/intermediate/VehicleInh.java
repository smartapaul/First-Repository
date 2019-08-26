package intermediate;

public class VehicleInh extends Transporter {
	
	private int tyres;
	private String vehecleType;
	
	
	public VehicleInh(String make, String model, String color, String bodyType, int engibeCc, int id,
			int passanger, int speed, int topspeed) {
		
		super.make = make;
		super.model = model;
		super.color = color;
		super.bodyType = bodyType;
		super.engibeCc = engibeCc;
		super.id = id;
		super.passanger = passanger;
		super.speed = 0;
		super.topspeed = topspeed;
	
}


	public int getTyres() {
		return tyres;
	}


	public void setTyres(int tyres) {
		this.tyres = tyres;
	}


	public String getVehecleType() {
		return vehecleType;
	}


	public void setVehecleType(String vehecleType) {
		this.vehecleType = vehecleType;
	}
	}

