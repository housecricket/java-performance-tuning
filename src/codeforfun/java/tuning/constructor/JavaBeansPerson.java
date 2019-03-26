package codeforfun.java.tuning.constructor;

public class JavaBeansPerson {

	private  String lastName =""; // required
	private  String firstName=""; // required
	private  String middleName=""; // required
	private  int bornYear=1985; // required

	private boolean isMale=true; // optional
	private boolean isEmployed=true; // optional
	private boolean isMarried=false; // optional
	
	public JavaBeansPerson () {};
	
	//setters
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setBornYear(int bornYear) {
		this.bornYear = bornYear;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public void setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
	
	
	

}
