import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the name of student 1: ");
            String name1 = scanner.nextLine();
            System.out.print("Enter the marks of student 1 in subject 1: ");
            int marks1Subject1 = scanner.nextInt();
            validateMarks(marks1Subject1);
            System.out.print("Enter the marks of student 1 in subject 2: ");
            int marks1Subject2 = scanner.nextInt();
            validateMarks(marks1Subject2);
            System.out.print("Enter the marks of student 1 in subject 3: ");
            int marks1Subject3 = scanner.nextInt();
            validateMarks(marks1Subject3);

            System.out.print("Enter the name of student 2: ");
            String name2 = scanner.next();
            System.out.print("Enter the marks of student 2 in subject 1: ");
            int marks2Subject1 = scanner.nextInt();
            validateMarks(marks2Subject1);
            System.out.print("Enter the marks of student 2 in subject 2: ");
            int marks2Subject2 = scanner.nextInt();
            validateMarks(marks2Subject2);
            System.out.print("Enter the marks of student 2 in subject 3: ");
            int marks2Subject3 = scanner.nextInt();
            validateMarks(marks2Subject3);

            double averageMarks1 = (marks1Subject1 + marks1Subject2 + marks1Subject3) / 3.0;
            double averageMarks2 = (marks2Subject1 + marks2Subject2 + marks2Subject3) / 3.0;

            System.out.println("Average marks of " + name1 + ": " + averageMarks1);
            System.out.println("Average marks of " + name2 + ": " + averageMarks2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integer values for marks.");
        } catch (NegativeValueException e) {
            System.out.println("Invalid input! Marks cannot be negative.");
        } catch (OutOfRangeException e) {
            System.out.println("Invalid input! Marks should be in the range of 0-100.");
        }
    }

    public static void validateMarks(int marks) throws NegativeValueException, OutOfRangeException {
        if (marks < 0) {
            throw new NegativeValueException("Marks cannot be negative");
        }
        if (marks < 0 || marks > 100) {
            throw new OutOfRangeException("Marks should be in the range of 0-100");
        }
    }
}
