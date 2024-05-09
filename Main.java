import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a person
        System.out.println("Enter details for a person:");
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Birthdate (YYYY-MM-DD): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Address: ");
        String address = scanner.nextLine();

        Personne person = new Personne(lastName, firstName, birthDate, address);
        System.out.println("Person created:");
        person.identifier();
        System.out.println("Age: " + person.calculerAge());

        // Create 3 groups
        ArrayList<Groupe> groupes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Creating group " + (i + 1) + ":");
            System.out.print("Enter the level for group " + (i + 1) + ": ");
            String level = scanner.nextLine();
            groupes.add(new Groupe(i + 1, level));
        }

        // Create 6 students
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Creating student " + (i + 1) + ":");
            System.out.print("Last name: ");
            String etudiantLastName = scanner.nextLine();
            System.out.print("First name: ");
            String etudiantFirstName = scanner.nextLine();
            System.out.print("Birthdate (YYYY-MM-DD): ");
            LocalDate etudiantBirthDate = LocalDate.parse(scanner.nextLine());
            System.out.print("Address: ");
            String etudiantAddress = scanner.nextLine();
            System.out.print("Student ID: ");
            int studentId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Average: ");
            double studentAverage = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            Etudiant etudiant = new Etudiant(etudiantLastName, etudiantFirstName, etudiantBirthDate, etudiantAddress, studentId, studentAverage, "L2_info", "");
            etudiants.add(etudiant);
        }

        // Assign the first 3 students to group 3 and the last 3 students to group 1
        for (int i = 0; i < 3; i++) {
            groupes.get(2).ajouterEtudiant(etudiants.get(i));
            groupes.get(0).ajouterEtudiant(etudiants.get(i + 3));
        }

        // Display the number of students in each group
        for (Groupe groupe : groupes) {
            System.out.println("Number of students in " + groupe.getNiveau() + " group " + groupe.getNumero() + ": " + groupe.calculerNbrEtudiant());
        }

        // Display the list of students in each group
        for (Groupe groupe : groupes) {
            System.out.println("Students in " + groupe.getNiveau() + " group " + groupe.getNumero() + ":");
            groupe.afficherEtudiants();
        }

        // Identify the major of group 3
        Etudiant majorGroupe3 = groupes.get(2).majorGroupe();
        System.out.println("Major of group 3: " + majorGroupe3.getNom() + " " + majorGroupe3.getPrenom());

        scanner.close();
    }
}
