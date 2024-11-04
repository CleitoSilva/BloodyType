//Cleiton ferreira da silva
// 24303
import java.util.Scanner;

public class BloodBankSystem {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first name
        System.out.print("Please Input your first name: ");
        String firstName = scanner.nextLine();

        // Input last name
        System.out.print("Please Input your last name: ");
        String lastName = scanner.nextLine();

        // Input donor/receiver choice
        int choice;
        do {
            System.out.print("Are you a donor or receiver (1 for Donor, 2 for Receiver): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (choice != 1 && choice != 2) {
                System.out.println("Choice doesn't exist, please try again!");
            }
        } while (choice != 1 && choice != 2);

        // Input blood type
        String bloodType;
        boolean isValidBloodType;
        do {
            System.out.print("Please provide your blood type (A+, O+, B+, AB+, A-, O-, B-, AB-): ");
            bloodType = scanner.nextLine();
            isValidBloodType = BloodClinic.isValidBloodType(bloodType);
            if (!isValidBloodType) {
                System.out.println("Invalid blood type, please try again!");
            }
        } while (!isValidBloodType);

        // Create donor or receiver object based on choice
        if (choice == 1) {
            Donor donor = new Donor(firstName, lastName, bloodType);
            String bloodTypesICanGive = donor.getBloodTypesICanGive();
            System.out.println(firstName + " " + lastName + ", you can give blood to the following blood types: " + bloodTypesICanGive);
        } else {
            Receiver receiver = new Receiver(firstName, lastName, bloodType);
            String bloodTypesICanReceive = receiver.getBloodTypesICanReceive();
            System.out.println(firstName + " " + lastName + ", you can receive blood from the following blood types: " + bloodTypesICanReceive);
        }

    }
}
