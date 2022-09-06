public class policy {

    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;
    private final double BASE_INSURANCE_PRICE = 600;

    public void setDefaultPolicy()
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

    public void setPolicy(int policyNumber, String providerName, String policyHolderFirstName, String policyHolderLastName, int policyHolderAge, String policyHolderSmokingStatus, double policyHolderHeight, double policyHolderWeight)
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

    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    public void setPolicyHolderFirstName(String policyHolderFirstName)
    {
        this.policyHolderFirstName = policyHolderFirstName;
    }

    public void setPolicyHolderLastName(String policyHolderLastName)
    {
        this.policyHolderLastName = policyHolderLastName;
    }

    public void setPolicyHolderAge(int policyHolderAge)
    {
        this.policyHolderAge = policyHolderAge;
    }

    public void setPolicyHolderSmokingStatus(String policyHolderSmokingStatus)
    {
        this.policyHolderSmokingStatus = policyHolderSmokingStatus;
    }

    public void setPolicyHolderHeight(double policyHolderHeight)
    {
        this.policyHolderHeight = policyHolderHeight;
    }

    public void setPolicyHolderWeight(double policyHolderWeight)
    {
        this.policyHolderWeight = policyHolderWeight;
    }

    public int getPolicyNumber()
    {
        return policyNumber;
    }

    public String getProviderName()
    {
        return providerName;
    }

    public String getPolicyHolderFirstName()
    {
        return policyHolderFirstName;
    }

    public String getPolicyHolderLastName()
    {
        return policyHolderLastName;
    }

    public int getPolicyHolderAge()
    {
        return policyHolderAge;
    }

    public String getPolicyHolderSmokingStatus()
    {
        return policyHolderSmokingStatus;
    }

    public double getPolicyHolderHeight()
    {
        return policyHolderHeight;
    }

    public double getPolicyHolderWeight()
    {
        return policyHolderWeight;
    }

    public double getPolicyHolderBMI()
    {
        return (policyHolderWeight / (policyHolderHeight * policyHolderHeight));
    }

    public double getInsurancePrice()
    {
        if (policyHolderAge > 50)
        {
            if (policyHolderSmokingStatus.equals("Yes"))
            {
                if (getPolicyHolderBMI() > 35)
                    return BASE_INSURANCE_PRICE + 75 + 100 + ((getPolicyHolderBMI() - 35) * 20);
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
            if (policyHolderSmokingStatus.equals("Yes"))
            {
                if (getPolicyHolderBMI() > 35)
                    return BASE_INSURANCE_PRICE + 100 + ((getPolicyHolderBMI() - 35) * 20);
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