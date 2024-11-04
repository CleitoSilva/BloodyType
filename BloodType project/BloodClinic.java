import java.util.Scanner;

class BloodClinic {
    // Method to check if blood type is valid
    public static boolean isValidBloodType(String bloodType) {
        String[] validBloodTypes = { "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" };
        for (String type : validBloodTypes) {
            if (type.equals(bloodType)) {
                return true;
            }
        }
        return false;
    }
}