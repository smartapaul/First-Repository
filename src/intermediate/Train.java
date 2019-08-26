package intermediate;


public class Train {
private String model;
private String make;
private int year;
private int speed;
private int topSpeed;
private int time;
private int distance;


{
	
	
}


public Train(String model, String make, int year, int speed, int topSpeed) {
	super();
	this.model = model;
	this.make = make;
	this.year = year;
	this.speed = speed;
	this.topSpeed = topSpeed;
	this.time = time;
	this.distance = distance;
}


public Train() {
	// TODO Auto-generated constructor stub
}


public String getModel() {
	return model;
}


public void setModel(String model) {
	this.model = model;
}


public String getMake() {
	return make;
}


public void setMake(String make) {
	this.make = make;
}


public int getYear() {
	return year;
}


public void setYear(int year) {
	this.year = year;
}


public int getSpeed() {
	return speed;
}


public void setSpeed(int speed) {
	this.speed = speed;
}


public int getTopSpeed() {
	return topSpeed;
}


public void setTopSpeed(int topSpeed) {
	this.topSpeed = topSpeed;
}
 public void setTime (int time) {
	 this.time = time;
	 
	 
 }

public void setDistance (int distance) {
	 this.distance = distance;
	 
}
 
//accelerate time

public void accelelate () {
	if (speed == topSpeed)
	{
		speed = topSpeed;
	}
	else {
		speed+=20;
	}
	}
	
	
	public void deccelelate () {
	if (speed == 0)
	{
		speed = 0;
	}
	else {
		speed-=-10;
	}

	}
	
}
