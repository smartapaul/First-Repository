package intermediate;

public class CarEnc

{
	private String make,model,color,bodyType;
	private  int engibeCc,probox,id1,passanger,speed,topspeed;
	
	CarEnc  (String ma, String mo, String co, String bo,
			int en, int po, int id,int pa, int to) 
	{
		 
		
	}

	public CarEnc(String make, String model, String color, String bodyType, int engibeCc, int probox, int id1,
			int passanger, int speed, int topspeed) {
		
		this.make = make;
		this.model = model;
		this.color = color;
		this.bodyType = bodyType;
		this.engibeCc = engibeCc;
		this.probox = probox;
		this.id1 = id1;
		this.passanger = passanger;
		this.speed = speed;
		this.topspeed = topspeed;
		
		
	}

	public CarEnc() {
		
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

	public int getProbox() {
		return probox;
	}

	public void setProbox(int probox) {
		this.probox = probox;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
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
}

//



