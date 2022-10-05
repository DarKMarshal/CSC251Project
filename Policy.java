public class Policy {

    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;
    private final double BASE_INSURANCE_PRICE = 600;

    /**
     * Default constructor
     */
    public Policy()
    {
        policyNumber = 0;
        providerName = "Void";
        policyHolderFirstName = "Void";
        policyHolderLastName = "Void";
        policyHolderAge = 0;
        policyHolderSmokingStatus = "Void";
        policyHolderHeight = 0;
        policyHolderWeight = 0;
    }

    /**
     * Overloaded constructor with parameters
     *
     * @param policyNumber User input for policy number
     * @param providerName User input for provider name
     * @param policyHolderFirstName User input for policyholder's first name
     * @param policyHolderLastName User input for policyholder's last name
     * @param policyHolderAge User input for policyholder's age
     * @param policyHolderSmokingStatus User input for policyholder's smoking status
     * @param policyHolderHeight User input for policyholder's height
     * @param policyHolderWeight User input for policyholder's weight
     */
    public Policy(int policyNumber, String providerName, String policyHolderFirstName, String policyHolderLastName, int policyHolderAge, String policyHolderSmokingStatus, double policyHolderHeight, double policyHolderWeight)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolderFirstName = policyHolderFirstName;
        this.policyHolderLastName = policyHolderLastName;
        this.policyHolderAge = policyHolderAge;
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
        this.policyHolderHeight = policyHolderHeight;
        this.policyHolderWeight = policyHolderWeight;
    }

    /**
     * Setter for policy number
     *
     * @param policyNumber User input for policy number
     */
    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    /**
     * Setter for provider name
     *
     * @param providerName User input for provider name
     */
    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    /**
     * Setter for policyholder's first name
     *
     * @param policyHolderFirstName User input for policyholder's first name
     */
    public void setPolicyHolderFirstName(String policyHolderFirstName)
    {
        this.policyHolderFirstName = policyHolderFirstName;
    }

    /**
     * Setter for policyholder's last name
     *
     * @param policyHolderLastName User input for policyholder's last name
     */
    public void setPolicyHolderLastName(String policyHolderLastName)
    {
        this.policyHolderLastName = policyHolderLastName;
    }

    /**
     * Setter for policyholder's age
     *
     * @param policyHolderAge User input for policyholder's age
     */
    public void setPolicyHolderAge(int policyHolderAge)
    {
        this.policyHolderAge = policyHolderAge;
    }

    /**
     * Setter for policyholder's smoking status
     *
     * @param policyHolderSmokingStatus User input for policyholder's smoking status
     */
    public void setPolicyHolderSmokingStatus(String policyHolderSmokingStatus)
    {
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
    }

    /**
     * Setter for policyholder's height
     *
     * @param policyHolderHeight User input for policyholder's height
     */
    public void setPolicyHolderHeight(double policyHolderHeight)
    {
        this.policyHolderHeight = policyHolderHeight;
    }

    /**
     * Setter for policyholder's weight
     *
     * @param policyHolderWeight User input for policyholder's weight
     */
    public void setPolicyHolderWeight(double policyHolderWeight)
    {
        this.policyHolderWeight = policyHolderWeight;
    }

    /**
     * Getter for policy number
     *
     * @return policyNumber
     */
    public int getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     * Getter for provider name
     *
     * @return providerName
     */
    public String getProviderName()
    {
        return providerName;
    }

    /**
     * Getter for policyholder's first name
     *
     * @return policyHolderFirstName
     */
    public String getPolicyHolderFirstName()
    {
        return policyHolderFirstName;
    }

    /**
     * Getter for policyholder's last name
     *
     * @return policyHolderLastName
     */
    public String getPolicyHolderLastName()
    {
        return policyHolderLastName;
    }

    /**
     * Getter for policyholder's age
     *
     * @return policyHolderAge
     */
    public int getPolicyHolderAge()
    {
        return policyHolderAge;
    }

    /**
     * Getter for policyholder's smoking status
     *
     * @return policyHolderSmokingStatus
     */
    public String getPolicyHolderSmokingStatus()
    {
        return policyHolderSmokingStatus;
    }

    /**
     * Getter for policyholder's height
     *
     * @return policyHolderHeight
     */
    public double getPolicyHolderHeight()
    {
        return policyHolderHeight;
    }

    /**
     * Getter for policyholder's weight
     *
     * @return policyHolderWeight
     */
    public double getPolicyHolderWeight()
    {
        return policyHolderWeight;
    }

    /**
     * Calculates the BMI of the policyholder
     *
     * @return BASE_INSURANCE_PRICE
     */
    public double getPolicyHolderBMI()
    {
        return ((policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight));
    }

    /**
     * Calculates the insurance price of the policyholder based on their BMI and smoking status
     *
     * @return BASE_INSURANCE_PRICE
     */
    public double getInsurancePrice()
    {
        if (policyHolderAge > 50)
        {
            if (policyHolderSmokingStatus.equals("smoker"))
            {
                if (getPolicyHolderBMI() > 35)
                    return BASE_INSURANCE_PRICE + 75 + 100 + ((getPolicyHolderBMI() - 35) * 20);
                else
                    return BASE_INSURANCE_PRICE + 75 + 100;
            }
            else
            {
                if (getPolicyHolderBMI() > 35)
                    return BASE_INSURANCE_PRICE + 75 + ((getPolicyHolderBMI() - 35) * 20);
                else
                    return BASE_INSURANCE_PRICE + 75;
            }
        }
        else
        {
            if (policyHolderSmokingStatus.equals("smoker"))
            {
                if (getPolicyHolderBMI() > 35)
                    return BASE_INSURANCE_PRICE + 100 + ((getPolicyHolderBMI() - 35) * 20);
                else
                    return BASE_INSURANCE_PRICE + 100;
            }
            else
            {
                if (getPolicyHolderBMI() > 35)
                    return BASE_INSURANCE_PRICE + ((getPolicyHolderBMI() - 35) * 20);
                else
                    return BASE_INSURANCE_PRICE;
            }
        }
    }

}