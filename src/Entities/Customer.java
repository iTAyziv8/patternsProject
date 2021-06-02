package Entities;

import java.util.Date;

public class Customer {

    private String name;
    private String lastName;
    private insurance insuranceOfCostumer;

    public Customer(String name, String lastName, insurance insuranceOfCostumer) {
        this.name = name;
        this.lastName = lastName;
        this.insuranceOfCostumer = insuranceOfCostumer;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public insurance getCostumerInsurance() {
        return insuranceOfCostumer;
    }

    public void setCostumerInsurance(insurance costumerInsurance) {
        this.insuranceOfCostumer = costumerInsurance;
    }
}
