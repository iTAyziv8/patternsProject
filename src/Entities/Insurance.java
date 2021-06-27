package Entities;


import javafx.beans.property.SimpleStringProperty;

public class Insurance
{
    private final String name;
    private final String familyName;
    private final String date;
    private final String remarks;
    private final String type;



    private Insurance(Builder builder)
    {
        this.name = builder.name;
        this.familyName = builder.familyName;
        this.date = builder.date;
        this.remarks = builder.remarks;
        this.type = builder.type;
    }

    public static class Builder {

        private String name;
        private String familyName;
        private String date;
        private String remarks;
        private String type;

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder setFamilyName(String familyName) {
                this.familyName = familyName;
                return this;
            }

            public Builder setDate(String date) {
                this.date = date;
                return this;
            }


            public Builder setRemarks(String remarks) {
                this.remarks = remarks;
                return this;
    }


    public Builder setType(String type) {
        this.type = type;
        return this;
    }

    public Insurance build(){
        return new Insurance(this);
    }

    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getDate() {
        return date;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getType() {
        return type;
    }
}
