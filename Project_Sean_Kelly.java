import java.util.Scanner;

public class Project_Sean_Kelly {

    public static void main(String[] args) {

        Policy policy = new Policy();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the policy number: ");
        policy.setPolicyNumber(keyboard.nextInt());

        System.out.println("Please enter the provider name: ");
        policy.setProviderName(keyboard.next());

        keyboard.nextLine();

        System.out.println("Please enter the policy holder's first name: ");
        policy.setPolicyHolderFirstName(keyboard.nextLine());

        System.out.println("Please enter the policy holder's last name: ");
        policy.setPolicyHolderLastName(keyboard.nextLine());

        System.out.println("Please enter the policy holder's age: ");
        policy.setPolicyHolderAge(keyboard.nextInt());

        keyboard.nextLine();

        System.out.println("Please enter the policy holder's smoking status (smoker/non-smoker) : ");
        policy.setPolicyHolderSmokingStatus(keyboard.nextLine());

        System.out.println("Please enter the policy holder's height: ");
        policy.setPolicyHolderHeight(keyboard.nextDouble());

        System.out.println("Please enter the policy holder's weight: ");
        policy.setPolicyHolderWeight(keyboard.nextDouble());

        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policy Holder's First Name: " + policy.getPolicyHolderFirstName());
        System.out.println("Policy Holder's Last Name: " + policy.getPolicyHolderLastName());
        System.out.println("Policy Holder's Age: " + policy.getPolicyHolderAge());
        System.out.println("Policy Holder's Smoking Status: " + policy.getPolicyHolderSmokingStatus());
        System.out.println("Policy Holder's Height: " + policy.getPolicyHolderHeight());
        System.out.println("Policy Holder's Weight: " + policy.getPolicyHolderWeight());
        System.out.println("Policy Holder's BMI: " + policy.getPolicyHolderBMI());
        System.out.println("Policy Price: " + policy.getInsurancePrice());
    }
}