package codeforfun.java.tuning.constructor;

public class Person {

	private  String lastName; // required
	private  String firstName; // required
	private  String middleName; // required
	private  int bornYear; // required

	private final boolean isMale; // optional
	private final boolean isEmployed; // optional
	private final boolean isMarried; // optional

	public Person(String lastName, String middleName, String firstName, int bornYear) {
		this(lastName, middleName, firstName, bornYear, true);
	}

	public Person(String lastName, String middleName, String firstName, int bornYear, boolean isMale) {
		this(lastName, middleName, firstName, bornYear, isMale, true);

	}

	public Person(String lastName, String middleName, String firstName, int bornYear, boolean isMale,
			boolean isEmployed) {
		this(lastName, middleName, firstName, bornYear, isMale, isEmployed, true);
	}

	public Person(String lastName, String middleName, String firstName, int bornYear, boolean isMale,
			boolean isEmployed, boolean isMarried) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.bornYear = bornYear;
		this.isMale = isMale;
		this.isEmployed = isEmployed;
		this.isMarried = isMarried;

	}

}
