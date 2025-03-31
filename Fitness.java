import java.util.Date;
public class Fitness {
	private String name;
	private int hours;
	private Date dob;
	private double fee = 150;
	public Fitness () {
		name = "John Jones";
		hours = 10;
		dob = new Date ();
	}
	public Fitness (String thename, int thehours, Date thedob) {
		name = thename;
		hours = thehours;
		dob = thedob;
	}
	public String getName() {
		return name;
	}
	public int getHours() {
		return hours;
	}
	public Date getDob() {
		return dob;
	}
	public void setName(String thename) {
		name = thename;
	}
	public void setHours(int thehours) {
		hours = thehours;
	}
	public void setDate(Date thedob) {
		dob = thedob;
	}
	public double calculateFees() {
		if (hours > 8) {
			fee += 20 * (hours - 8);
		}return fee;
	}
	public String toString() {
		return name + "\t" + hours + "\t\t" + fee;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

