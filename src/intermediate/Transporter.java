package intermediate;

public class Transporter {

	protected String make,model,color,bodyType;
	protected  int engibeCc,id,passanger,speed,topspeed;
	

	public void accelelate () {
	if (speed == topspeed)
	{
		speed = topspeed;
	}
	else {
		speed++;
	}
	}
	
	
	public void deccelelate () {
	if (speed == 0)
	{
		speed = 0;
	}
	else {
		speed--;
	}
}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBodyType() {
		return bodyType;
	}


	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}


	public int getEngibeCc() {
		return engibeCc;
	}


	public void setEngibeCc(int engibeCc) {
		this.engibeCc = engibeCc;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPassanger() {
		return passanger;
	}


	public void setPassanger(int passanger) {
		this.passanger = passanger;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getTopspeed() {
		return topspeed;
	}


	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
	
	
}
