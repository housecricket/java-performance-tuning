package codeforfun.java.tuning.constructor;

public class StaticBuilderPerson {

	private final String lastName; // required
	private final String firstName; // required
	private final String middleName; // required
	private final int bornYear; // required

	private final boolean isMale; // optional
	private final boolean isEmployed; // optional
	private final boolean isMarried; // optional

	public static class Builder {

		private String lastName; // required
		private final String firstName; // required
		private final String middleName; // required
		private final int bornYear; // required

		private boolean isMale; // optional
		private boolean isEmployed; // optional
		private boolean isMarried; // optional

		public Builder(String lastName, String firstName, String middleName, int bornYear) {
			this.lastName = lastName;
			this.firstName = firstName;
			this.middleName = middleName;
			this.bornYear = bornYear;
		}

		public Builder setEmployed(boolean isEmployed) {
			this.isEmployed = isEmployed;
			return this;
		}

		public Builder setMale(boolean isMale) {
			this.isMale = isMale;
			return this;
		}

		public Builder setMarried(boolean isMarried) {
			this.isMarried = isMarried;
			return this;
		}

		public StaticBuilderPerson build() { 
			return new StaticBuilderPerson(this);
		}
	}

	private StaticBuilderPerson(Builder builder) {
		lastName = builder.lastName;
		firstName = builder.firstName;
		middleName = builder.middleName;
		bornYear = builder.bornYear;
		isMarried = builder.isMarried;
		isMale = builder.isMale;
		isEmployed = builder.isEmployed;
	}
	
	public static void main (String args[]) {
		StaticBuilderPerson asianperson = new StaticBuilderPerson.Builder("Dang", "Anh", "Trung", 1985).setMarried(true).setMale(true).setEmployed(true).build();
	}

}
