import java.util.Scanner;
public class NumbersOfYears {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        /* Input number of days from user */
        System.out.println("Input days: ");
        int days = in.nextInt();

        /* Year, weeks and days conversion  */
        int years = (days / 365);
        int weeks = (days % 365) / 7;
            days  = (days % 365) % 7;

        /* Print total years, weeks and remaining days in given days */
        System.out.println("Input amount is equivalent to " + years + " year " + weeks + " weeks and " + days +" days");

    }
}
