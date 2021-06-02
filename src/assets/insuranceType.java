package assets;

public enum insuranceType {

    CARINSURANCE_TYPE("Car insurance"),
    LIFEINSURANCE_TYPE("Life insurance"),
    HEALTHINSURANCE_TYPE("Health insurance"),
    APARTMENTYPEINSURANCE_TYPE("Apartment insurance");

    private String inturanceTypeString;

    insuranceType(String s) {
        this.inturanceTypeString = s;
    }

    public static insuranceType fromString(String text) {
        for (insuranceType b : insuranceType.values()) {
            if (b.inturanceTypeString.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

    public static  boolean contains(String insuranceTypeString) {
        for (insuranceType f : insuranceType.values()) {
            if (f.name().equals(insuranceTypeString)) return true;
        }
        return false;
    }

    public static <T extends Enum<T>> T getEnumFromString(Class<T> c, String string) {
        if (c != null && string != null) {
            try {
                return Enum.valueOf(c, string.trim().toUpperCase());
            } catch (IllegalArgumentException ex) {
            }
        }
        return null;
    }

    public String getInsuranceTypeString() {
        return inturanceTypeString;
    }


}
