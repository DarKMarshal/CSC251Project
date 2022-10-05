import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_Sean_Kelly {

    public static void main(String[] args) throws IOException {

        int policyCount = 0;
        int repeatCount;
        ArrayList<Policy> policyList = new ArrayList<Policy>();
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        //Holder Variables
        int policyNumber;
        String providerName;
        String policyHolderFirstName;
        String policyHolderLastName;
        int policyHolderAge;
        String policyHolderSmokingStatus;
        double policyHolderHeight;
        double policyHolderWeight;


        do {

            policyNumber = inputFile.nextInt();
            inputFile.nextLine();
            providerName = inputFile.nextLine();
            policyHolderFirstName = inputFile.nextLine();
            policyHolderLastName = inputFile.nextLine();
            policyHolderAge = inputFile.nextInt();
            inputFile.nextLine();
            policyHolderSmokingStatus = inputFile.nextLine();
            policyHolderHeight = inputFile.nextDouble();
            policyHolderWeight = inputFile.nextDouble();
            inputFile.nextLine();

            policyList.add(new Policy(policyNumber, providerName, policyHolderFirstName, policyHolderLastName, policyHolderAge, policyHolderSmokingStatus, policyHolderHeight, policyHolderWeight));

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
        inputFile.close();
    }
}