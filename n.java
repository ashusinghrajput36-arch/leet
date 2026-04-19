public class NumbersProcessor {
    public static void main(String[] args) {
        // Check if at least one argument is provided
        if (args.length == 0) {
            System.out.println("Please provide numbers as arguments.");
            return;
        }

        // Variables to store sum and largest number
        int sum = 0;
        int largest = Integer.MIN_VALUE;

        System.out.println("You entered the following numbers:");

        // Loop through all arguments
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]); // convert String to int
            System.out.println("Argument " + (i + 1) + ": " + num);

            sum += num; // add to sum

            if (num > largest) {
                largest = num; // track largest number
            }
        }

        // Calculate average
        double average = (double) sum / args.length;

        // Display results
        System.out.println("Total numbers entered: " + args.length);
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + average);
        System.out.println("Largest number: " + largest);
    }
}
