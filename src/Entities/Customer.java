package Entities;


import java.util.Date;

public class Customer {

    private String firstName;
    private String lastName;
    private String remarks;
    private insurance insuranceOfCostumer;

//    public Customer(String name, String lastName, insurance insuranceOfCostumer,String Remarks) {
//        this.firstName = name;
//        this.lastName = lastName;
//        this.remarks = Remarks;
//        this.insuranceOfCostumer = insuranceOfCostumer;
//    }
    //customer builder pattern
    public Customer firstName(String Fname){
        this.firstName = Fname;

        return this;
    }
    public Customer lastName(String Lname){
        this.lastName = Lname;

        return this;
    }
    public Customer remarks(String remarks){
        this.remarks = remarks;

        return this;
    }
    public Customer withInsurance(insurance insurce){
        this.insuranceOfCostumer = insurce;

        return this;
    }

    public String getName() {
        return firstName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public insurance getInsuranceOfCostumer() {
        return insuranceOfCostumer;
    }

    public void setInsuranceOfCostumer(insurance insuranceOfCostumer) {
        this.insuranceOfCostumer = insuranceOfCostumer;
    }

    public void setName(String name) {
        this.firstName = name;
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
