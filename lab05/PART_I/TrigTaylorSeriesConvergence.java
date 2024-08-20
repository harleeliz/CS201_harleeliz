import java.util.Scanner;

public class TrigTaylorSeriesConvergence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer angle in degrees: ");

        if (scanner.hasNextInt()) {
            int angleDegrees = scanner.nextInt();
            double angleRadians = Math.toRadians(angleDegrees);
            double estimatedSinX = 0;
            double previousEstimatedSinX = 0;
            double tolerance = 0.000001;
            int termsNeeded = 0;

            do {
                previousEstimatedSinX = estimatedSinX;
                estimatedSinX += Math.pow(-1, termsNeeded) * Math.pow(angleRadians, 2 * termsNeeded + 1) / factorial(2 * termsNeeded + 1);
                termsNeeded++;
            } while (Math.abs(estimatedSinX - previousEstimatedSinX) > tolerance);

            double actualSinX = Math.sin(angleRadians);

            System.out.printf("%d %d %.16f %.16f%n", angleDegrees, termsNeeded, estimatedSinX, actualSinX);
        } else {
            System.out.println("-180 to 180 by 10s");
            for (int angleDegrees = -180; angleDegrees <= 180; angleDegrees += 10) {
                double angleRadians = Math.toRadians(angleDegrees);
                double estimatedSinX = 0;
                double previousEstimatedSinX = 0;
                double tolerance = 0.000001;
                int termsNeeded = 0;

                do {
                    previousEstimatedSinX = estimatedSinX;
                    estimatedSinX += Math.pow(-1, termsNeeded) * Math.pow(angleRadians, 2 * termsNeeded + 1) / factorial(2 * termsNeeded + 1);
                    termsNeeded++;
                } while (Math.abs(estimatedSinX - previousEstimatedSinX) > tolerance);

                double actualSinX = Math.sin(angleRadians);

                System.out.printf("Test Case %d - %d degrees%n", Math.abs(angleDegrees), angleDegrees);
                System.out.printf("%d %d %.16f %.16f%n", angleDegrees, termsNeeded, estimatedSinX, actualSinX);
            }
        }
    }

    public static double factorial(int n) {
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
