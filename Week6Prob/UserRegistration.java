
class InvalidCountryException extends Exception {
    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}
public class UserRegistration {
    void registerUser(String username, String userCountry) throws InvalidCountryException {

        if (!userCountry.equals("India")) {
    
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
    
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {

        UserRegistration userRegistration = new UserRegistration();

        try {
    
            userRegistration.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
    
            System.out.println(e.getMessage());
        }

        try {
    
            userRegistration.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
    
            System.out.println(e.getMessage());
        }
    }
}

