import java.util.Scanner;

public class Project_Sean_Kelly {

    public static void main(String[] args) {

        Policy policy = new Policy();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the policy number: ");
        policy.setPolicyNumber(keyboard.nextInt());

        keyboard.nextLine();

        System.out.print("Please enter the provider name: ");
        policy.setProviderName(keyboard.nextLine());

        System.out.print("Please enter the policyholder's first name: ");
        policy.setPolicyHolderFirstName(keyboard.nextLine());

        System.out.print("Please enter the policyholder's last name: ");
        policy.setPolicyHolderLastName(keyboard.nextLine());

        System.out.print("Please enter the policyholder's age: ");
        policy.setPolicyHolderAge(keyboard.nextInt());

        keyboard.nextLine();

        System.out.print("Please enter the policyholder's smoking status (smoker/non-smoker) : ");
        policy.setPolicyHolderSmokingStatus(keyboard.nextLine());

        System.out.print("Please enter the policyholder's height: ");
        policy.setPolicyHolderHeight(keyboard.nextDouble());

        System.out.print("Please enter the policyholder's weight: ");
        policy.setPolicyHolderWeight(keyboard.nextDouble());

        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getPolicyHolderFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getPolicyHolderLastName());
        System.out.println("Policyholder's Age: " + policy.getPolicyHolderAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getPolicyHolderSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getPolicyHolderHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getPolicyHolderWeight() +" pounds");
        System.out.printf("Policyholder's BMI: %.2f\n", policy.getPolicyHolderBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.getInsurancePrice());
    }
}