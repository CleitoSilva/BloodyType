class Donor {
    private String firstName;
    private String lastName;
    private String bloodType;

    // Constructor
    public Donor(String firstName, String lastName, String bloodType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bloodType = bloodType;
    }

    // Method to get the blood types that this donor can give to
    public String getBloodTypesICanGive() {
        String bloodTypesICanGive = "";
        switch (bloodType) {
            case "A+":
                bloodTypesICanGive = "A+, AB+";
                break;
            case "O+":
                bloodTypesICanGive = "O+, A+, B+, AB+";
                break;
            case "B+":
                bloodTypesICanGive = "B+, AB+";
                break;
            case "AB+":
                bloodTypesICanGive = "AB+";
                break;
            case "A-":
                bloodTypesICanGive = "A+, A-, AB+, AB-";
                break;
            case "O-":
                bloodTypesICanGive = "O+, O-, A+, A-, B+, B-, AB+, AB-";
                break;
            case "B-":
                bloodTypesICanGive = "B+, B-, AB+, AB-";
                break;
            case "AB-":
                bloodTypesICanGive = "AB+, AB-";
                break;
        }
        return bloodTypesICanGive;
    }
}