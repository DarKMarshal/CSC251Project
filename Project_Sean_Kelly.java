import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_Sean_Kelly {

    public static void main(String[] args) throws IOException {

        int policyCount = 0;
        int repeatCount;
        ArrayList<Policy> policyList = new ArrayList<>();
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        int smokerCount = 0;
        int nonSmokerCount = 0;

        do {

            policyList.add(new Policy());

            policyList.get(policyCount).setPolicyNumber(inputFile.nextInt());
            inputFile.nextLine();
            policyList.get(policyCount).setProviderName(inputFile.nextLine());
            policyList.get(policyCount).setPolicyHolderFirstName(inputFile.nextLine());
            policyList.get(policyCount).setPolicyHolderLastName(inputFile.nextLine());
            policyList.get(policyCount).setPolicyHolderAge(inputFile.nextInt());
            inputFile.nextLine();
            policyList.get(policyCount).setPolicyHolderSmokingStatus(inputFile.nextLine());
            policyList.get(policyCount).setPolicyHolderHeight(inputFile.nextDouble());
            policyList.get(policyCount).setPolicyHolderWeight(inputFile.nextDouble());
            inputFile.nextLine();

            if (policyList.get(policyCount).getPolicyHolderSmokingStatus().equalsIgnoreCase("smoker"))
                smokerCount++;
            else
                nonSmokerCount++;

            policyCount++;

        }while(inputFile.hasNext());

        repeatCount = policyCount;

        while(repeatCount > 0){
            System.out.println("\nPolicy Number: " + policyList.get(policyCount - repeatCount).getPolicyNumber());
            System.out.println("Provider Name: " + policyList.get(policyCount - repeatCount).getProviderName());
            System.out.println("Policyholder's First Name: " + policyList.get(policyCount - repeatCount).getPolicyHolderFirstName());
            System.out.println("Policyholder's Last Name: " + policyList.get(policyCount - repeatCount).getPolicyHolderLastName());
            System.out.println("Policyholder's Age: " + policyList.get(policyCount - repeatCount).getPolicyHolderAge());
            System.out.println("Policyholder's Smoking Status: " + policyList.get(policyCount - repeatCount).getPolicyHolderSmokingStatus());
            System.out.println("Policyholder's Height: " + policyList.get(policyCount - repeatCount).getPolicyHolderHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policyList.get(policyCount - repeatCount).getPolicyHolderWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f\n", policyList.get(policyCount - repeatCount).getPolicyHolderBMI());
            System.out.printf("Policy Price: $%.2f\n", policyList.get(policyCount - repeatCount).getInsurancePrice());

            repeatCount--;
        }

        System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

        inputFile.close();
    }
}