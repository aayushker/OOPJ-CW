public class Main6 {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new InvalidInputException("Insufficient arguments provided.");
            }
            
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Invalid age. Age must be between 18 and 59.");
            }
            
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid age format. Age must be a valid integer.");
        }
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
