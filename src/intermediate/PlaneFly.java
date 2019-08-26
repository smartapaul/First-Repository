package intermediate;

public class PlaneFly {
private String make2, model2, color2, bodyType2;
private int engType2, tankCC2, passanger2, speed2, topSpeed2;





public PlaneFly() {
	super();
	this.make2 = make2;
	this.model2 = model2;
	this.color2 = color2;
	this.bodyType2 = bodyType2;
	this.engType2 = engType2;
	this.tankCC2 = tankCC2;
	this.passanger2 = passanger2;
	this.speed2 = speed2;
	this.topSpeed2 = topSpeed2;
}


public void PlaneFly1() {
	// TODO Auto-generated constructor stub
}


public String getMake2() {
	return make2;
}


public void setMake2(String make2) {
	this.make2 = make2;
}


public String getModel2() {
	return model2;
}


public void setModel2(String model2) {
	this.model2 = model2;
}


public String getColor2() {
	return color2;
}


public void setColor2(String color2) {
	this.color2 = color2;
}


public String getBodyType2() {
	return bodyType2;
}


public void setBodyType2(String bodyType2) {
	this.bodyType2 = bodyType2;
}


public int getEngType2() {
	return engType2;
}


public void setEngType2(int engType2) {
	this.engType2 = engType2;
}


public int getTankCC2() {
	return tankCC2;
}


public void setTankCC2(int tankCC2) {
	this.tankCC2 = tankCC2;
}


public int getPassanger2() {
	return passanger2;
}


public void setPassanger2(int passanger2) {
	this.passanger2 = passanger2;
}


public int getSpeed2() {
	return speed2;
}


public void setSpeed2(int speed2) {
	this.speed2 = speed2;
}


public int getTopSpeed2() {
	return topSpeed2;
}


public void setTopSpeed2(int topSpeed2) {
	this.topSpeed2 = topSpeed2;
}


public void fly () {
if (speed2 == topSpeed2)
{
	speed2 = topSpeed2;
}
else {
	speed2++;
}
}


public void land () {
if (speed2 == 0)
{
	speed2 = 0;
}
else {
	speed2--;
}


}
}


