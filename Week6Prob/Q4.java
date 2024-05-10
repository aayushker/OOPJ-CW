public class Q4 {
    public static void main(String[] args) {
        try {
        
            int[] numbers = new int[5];
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }


            double average = (double) sum / numbers.length;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter integers only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide 5 integers as command line arguments.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred. Please check your input.");
        } catch (Exception e) {
            System.out.println("An error occurred. Please try again.");
        }
    }
}