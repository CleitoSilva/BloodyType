class Receiver {
    private String firstName;
    private String lastName;
    private String bloodType;

    // Constructor
    public Receiver(String firstName, String lastName, String bloodType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bloodType = bloodType;
    }

    // Method to get the blood types that this receiver can receive
    public String getBloodTypesICanReceive() {
        String bloodTypesICanReceive = "";
        switch (bloodType) {
            case "A+":
                bloodTypesICanReceive = "A+, A-, O+, O-";
                break;
            case "O+":
                bloodTypesICanReceive = "O+, O-";
                break;
            case "B+":
                bloodTypesICanReceive = "B+, B-, O+, O-";
                break;
            case "AB+":
                bloodTypesICanReceive = "A+, A-, B+, B-, AB+, AB-, O+, O-";
                break;
            case "A-":
                bloodTypesICanReceive = "A-, O-";
                break;
            case "O-":
                bloodTypesICanReceive = "O-";
                break;
            case "B-":
                bloodTypesICanReceive = "B-, O-";
                break;
            case "AB-":
                bloodTypesICanReceive = "A-, B-, AB-, O-";
                break;
        }
        return bloodTypesICanReceive;
    }
}
