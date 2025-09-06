public class SumOfTwoNumbers {
    public static void main(String[] args) {
        
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Please enter exactly two numbers.");
        } else {
            try {
                // Convert arguments to integers
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                
                // Calculate sum
                int sum = num1 + num2;
                
                // Display result
                System.out.println("The sum is: " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid integers.");
            }
        }
    }
}
