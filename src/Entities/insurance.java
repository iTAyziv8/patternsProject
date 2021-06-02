package Entities;

import java.time.LocalDate;
import java.util.Date;

public class insurance {

    private String insuranceType;
    private LocalDate insuranceDate;
    private Customer customer;


    public insurance(String insuranceType, LocalDate insuranceDate, Customer customer) {
        this.insuranceType = insuranceType;
        this.insuranceDate = insuranceDate;
        this.customer = customer;
    }









    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public LocalDate getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(LocalDate insuranceDate) {
        this.insuranceDate = insuranceDate;
    }

    public Customer getInsuranceCustomer() {
        return customer;
    }

    public void setInsuranceCustomer(Customer insuranceCustomer) {
        this.customer = insuranceCustomer;
    }
}
