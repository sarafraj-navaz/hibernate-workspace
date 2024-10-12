package user_define_exception_All;

//Step 2: Use the custom exception in a program
public class CustomExceptionExample {
// Method that checks age and throws InvalidAgeException if the age is invalid
	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 0) {
			throw new InvalidAgeException("Age cannot be negative.");
		} else {
			System.out.println("Valid age: " + age);
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(25); // Valid age, no exception thrown
			checkAge(-5); // Invalid age, exception thrown
		} catch (InvalidAgeException e) {
			System.out.println("Caught the exception: " + e.getMessage());
		}
	}
}
