package user_define_exception_All;

//Step 1: Define the custom exception class
class InvalidAgeException extends Exception {
 // Constructor that accepts a message
    public InvalidAgeException(String message) {
     super(message);
 }
}

