package day4.InfoTank.GetterSetter;

public class Tank {

	private String color;
	private int crew;
	private int maxSpeed;

	public Tank() {
		this("red", 4, 120);
	}

	public Tank(String color) {
		this(color, 0, 0);

	}

	public Tank(String color, int crew, int maxSpeed) {
		this.color = color;
		this.crew = crew;
		setMaxSpeed(maxSpeed);

	}

	public Tank(int crew, String color, int maxSpeed) {
		this.color = color;
		this.crew = crew;
		setMaxSpeed(maxSpeed);
	}

	public Tank(int crew, int maxSpeed, String color) {
		this.color = color;
		this.crew = crew;
		setMaxSpeed(maxSpeed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed > 200) {
			this.maxSpeed = 200;
		} else {
			this.maxSpeed = maxSpeed;
		}
	}
}