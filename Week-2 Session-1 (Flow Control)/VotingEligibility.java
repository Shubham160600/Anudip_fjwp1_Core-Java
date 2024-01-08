package shubham;

public class VotingEligibility {
    public static void main(String[] args) {
        // Age
        int age = 25;
        // Is Indian citizen?
        boolean isIndianCitizen = true;

        // Check voting eligibility
        if (isIndianCitizen) {
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You must be 18 years old or above to vote.");
            }
        } else {
            System.out.println("Only citizens are eligible to vote.");
        }
    }
}
